package RobotsAreCool.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import RobotsAreCool.Templates.RobotMap;

public class Shooter extends Subsystem {
    
    public Jaguar j;
    private AnalogChannel us = new AnalogChannel(1,1);
    
    public Shooter()
    {
        j = new Jaguar(RobotMap.launcherMotor);   
    }
    
    public void useRange()
    {
        int range = range();
        j.set(adjust(range));
    }
    
    private int range()
    {
        int usRange = us.getValue()/2;
        System.out.println("Range: " + usRange);
        return usRange;
    }
    
    private double adjust(int r)
    {
        double range = (double)r;
        
        if(range < 160)//change later
            range = (range*range*.00002) + .001 * range + .298;
        else
            range =1;
        
        return range;
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
