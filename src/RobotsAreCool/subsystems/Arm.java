package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem 
{
    private Jaguar arm;
    private Solenoid crane;
    private double speed;
    
    public Arm()
    {
        arm = new Jaguar(RobotMap.ARM_MOTOR_CHANNEL);
        crane = new Solenoid(RobotMap.ARM_SOLENOID_CHANNEL);
        
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void set(double s)
    {
        arm.set(s);
    }
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void stop()
    {
        arm.set(0);
    }

    public void set(boolean b) 
    {
        crane.set(b);
    }

    public void setSpeed(double s) 
    {
        speed = s;
    }

    public double getSpeed() 
    {
        return speed;
    }
}
