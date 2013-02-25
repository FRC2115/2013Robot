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
            LEFT_FRONT_MOTOR_CHANNEL = 1,
            LEFT_BACK_MOTOR_CHANNEL = 2,
            RIGHT_FRONT_MOTOR_CHANNEL = 3,
            RIGHT_BACK_MOTOR_CHANNEL = 4,
            ARM_MOTOR_CHANNEL = 5,
            LAUNCHER_MOTOR_CHANNEL = 6,
            
            //Solenoid Channels
            ARM_SOLENOID_CHANNEL = 1,
            CLIP_SOLENOID_CHANNEL = 2,
            PLUNGER_SOLENOID_CHANNEL = 3,
            
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
