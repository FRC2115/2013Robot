/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotsAreCool.subsystems;

import RobotsAreCool.Templates.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Tripp
 */
public class Clip extends Subsystem 
{
    private Solenoid s;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Clip()
    {
        s = new Solenoid(RobotMap.CLIP_SOLENOID_CHANNEL);
    }
    
    public void set(boolean n)
    {
        s.set(n);
    }
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
