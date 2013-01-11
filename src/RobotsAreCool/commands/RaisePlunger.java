package RobotsAreCool.commands;

import RobotsAreCool.OI;
import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author Tripp
 */
public class RaisePlunger extends CommandBase 
{
    Jaguar j;
    
    public RaisePlunger() 
    {
        j = new Jaguar(OI.PLUNGER_JAG_PORT);
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
        j.set(-0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        j.stopMotor();
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
