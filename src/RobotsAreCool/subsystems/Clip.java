/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotsAreCool.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import RobotsAreCool.Templates.RobotMap;

/**
 *
 * @author Tripp
 */
public class Clip extends Subsystem 
{
    
    public Solenoid s;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Clip()
    {
        s = new Solenoid(RobotMap.clipSolenoid);
    }
    
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
