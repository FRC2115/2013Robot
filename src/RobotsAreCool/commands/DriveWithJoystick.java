package RobotsAreCool.commands;

import RobotsAreCool.OI;
import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author Tripp and his bitches
 */
public class DriveWithJoystick extends CommandBase {
    
    Jaguar jLeft, jRight;
    
    public DriveWithJoystick() 
    {
        jLeft = new Jaguar(OI.DRIVE_LEFT_JAG_PORT);
        jRight = new Jaguar(OI.DRIVE_RIGHT_JAG_PORT);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
