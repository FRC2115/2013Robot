package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem 
{
    private Jaguar j;
    
    public Arm()
    {
        j = new Jaguar(RobotMap.ARM_MOTOR_CHANNEL);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void set(double x)
    {
        j.set(x);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
