package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem 
{
    private Jaguar j;
    private Solenoid s;
    
    public Arm()
    {
        j = new Jaguar(RobotMap.ARM_MOTOR_CHANNEL);
        s = new Solenoid(RobotMap.ARM_SOLENOID_CHANNEL);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void setSolenoid(boolean n)
    {
        s.set(n);
    }
    
    public void setJaguarSpeed(double x)
    {
        j.set(x);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
