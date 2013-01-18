package RobotsAreCool.Templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    public static final int 
            //Motor Channels
            LEFT_MOTOR_CHANNEL = 1,
            RIGHT_MOTOR_CHANNEL = 2,
            LAUNCHER_MOTOR_CHANNEL = 3,
            ARM_MOTOR_CHANNEL = 4,
            PLUNGER_MOTOR_CHANNEL = 5,
            
            //Solenoid Channels
            PLUNGER_SOLENOID_CHANNEL = 1,
            ARM_SOLENOID_CHANNEL = 2,
            CLIP_SOLENOID_CHANNEL = 3,
            
            //Relay Channels
            COMPRESSOR_RELAY_CHANNEL = 1,
            
            //Switch Channels
            PRESSURE_SWITCH_CHANNEL = 1;
            
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
