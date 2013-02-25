package RobotsAreCool.Templates;

import RobotsAreCool.commands.CommandBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class RobotTemplate extends IterativeRobot {

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() 
    {
        CommandBase.init();
    }

    public void autonomousInit() 
    {
        // schedule the autonomous command (example)
        //Scheduler.getInstance().add(new Autonomous());
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    public void teleopInit() 
    {
        //autonomousCommand.cancel();    
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() 
    {
        Scheduler.getInstance().run();
        CommandBase.oi.call();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() 
    {
        //LiveWindow.run();
    }
}
