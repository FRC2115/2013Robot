package RobotsAreCool.commands;

import RobotsAreCool.Templates.OI;
import RobotsAreCool.Templates.RobotMap;
import RobotsAreCool.subsystems.*;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Dashboard;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command 
{
    public static OI oi;
    public static Arm arm = new Arm();
    public static Chassis chassis = new Chassis();
   // public static Camera camera = new Camera();
    public static Clip clip = new Clip();
    public static Plunger plunger = new Plunger();
    public static Shooter shooter = new Shooter();
    // Create a single static instance of all of your subsystems
    
        public static Compressor compressor = new Compressor(RobotMap.PRESSURE_SWITCH_CHANNEL,RobotMap.COMPRESSOR_RELAY_CHANNEL);
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        
        compressor.start();
        
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
        SmartDashboard.putData(chassis);
    }
    
    public static void call()
    {
        oi = new OI();
    }

    public CommandBase(String name) 
    {
        super(name);
    }

    public CommandBase() 
    {
        super();
    }
}
