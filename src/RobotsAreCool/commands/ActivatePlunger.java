/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotsAreCool.commands;

import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Tripp
 */
public class ActivatePlunger extends CommandBase 
{
    
    private Solenoid s;
    
    public ActivatePlunger() 
    {
        requires(plunger);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        //plunger.s.set(true);
        s.set(false);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    
    }
    
}
