/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import RobotsAreCool.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Tripp
 */
public class Chassis extends Subsystem 
{
    private final double SPEED_MULTIPLIER = -1;
    
    private RobotDrive drive;
    
    public Chassis()
    {
        
        drive = new RobotDrive(RobotMap.LEFT_FRONT_MOTOR_CHANNEL, RobotMap.LEFT_BACK_MOTOR_CHANNEL, RobotMap.RIGHT_FRONT_MOTOR_CHANNEL, RobotMap.RIGHT_BACK_MOTOR_CHANNEL);
        drive.setSafetyEnabled(false);
    }
    
    public RobotDrive getDrive()
    {
        return drive;
    }
    
    public void driveWithJoystick(double leftAxis, double rightAxis)
    {
        drive.tankDrive(leftAxis * SPEED_MULTIPLIER, rightAxis * SPEED_MULTIPLIER);
    }
    
    public void initDefaultCommand() 
    {
        setDefaultCommand(new DriveWithJoystick());
    }
}
