package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem 
{
    
    private Jaguar j;
    private AnalogChannel us;
    
    public Shooter()
    {
        us = new AnalogChannel(1,1);
        j = new Jaguar(RobotMap.LAUNCHER_MOTOR_CHANNEL);   
    }
    
    public void useRange()
    {
        j.set(adjust(range()));
    }
    
    private int range()
    {
        int usRange = us.getValue() / 2;
        System.out.println("Range: " + usRange);
        return usRange;
    }
    
    private double adjust(double r)
    {
        if(r < 160) 
        {
            r = (r * r* .00002) + .001 * r + .298;
        }
        else 
        {
            r = 1;
        }
        
        return r;
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void set(double speed)
    {
        j.set((speed - 1) * -.5);
    }
}
