package RobotsAreCool.commands;

import RobotsAreCool.Templates.OI;
import RobotsAreCool.subsystems.Arm;
import RobotsAreCool.subsystems.Camera;
import RobotsAreCool.subsystems.Chassis;
import RobotsAreCool.subsystems.Clip;
import RobotsAreCool.subsystems.Plunger;
import RobotsAreCool.subsystems.Shooter;
import edu.wpi.first.wpilibj.command.Command;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static Arm arm;
    public static Chassis chassis;
    public static Camera camera;
    public static Clip clip;
    public static Plunger plunger;
    public static Shooter shooter;
    // Create a single static instance of all of your subsystems
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        chassis = new Chassis();
        camera = new Camera();
        arm = new Arm();
        clip = new Clip();
        plunger = new Plunger();
        shooter = new Shooter();
        
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
