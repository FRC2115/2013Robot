/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An abstraction to represent the Plunger mechanism on our robot. 
 * @author Tripp Weiner
 * @author Jordan Giacone
 */
public class Plunger extends Subsystem 
{
    private Solenoid s;
    
    public Plunger()
    {
        s = new Solenoid(RobotMap.PLUNGER_SOLENOID_CHANNEL);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void set(boolean b)
    {
        s.set(b);
    }
}
