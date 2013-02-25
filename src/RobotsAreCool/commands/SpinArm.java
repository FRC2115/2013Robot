package RobotsAreCool.commands;

/**
 *
 * @author Tripp
 */
public class SpinArm extends CommandBase
{
    boolean l;
    
    public SpinArm(boolean left) 
    {
        requires(arm);
        
        l = left;
        
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
        double speed = arm.getSpeed();
        if(l)
            speed *= -1;
        
        arm.set(speed);
        System.out.println(speed);
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
        arm.stop();
    }
}
