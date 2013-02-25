package RobotsAreCool.commands;

/**
 *
 * @author Tripp
 * @author Jordan
 */
public class FireFrisbee extends CommandBase 
{
    private final double m_timeout;
    
    public FireFrisbee(double timeout) 
    {
        requires(shooter);
        requires(clip);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        m_timeout = timeout;
//        initialize();
//        execute();
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
        setTimeout(m_timeout);
        System.out.print("fire init");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        System.out.print("fire execute");
        clip.set(true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() 
    {
        clip.set(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    
    }
}
