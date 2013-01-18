package RobotsAreCool.Templates;
import RobotsAreCool.commands.ActivatePlunger;
import RobotsAreCool.commands.AutoAim;
import RobotsAreCool.commands.AutoShoot;
import RobotsAreCool.commands.AutoShootSpeed;
import RobotsAreCool.commands.DeactivatePlunger;
import RobotsAreCool.commands.FireFrisbee;
import RobotsAreCool.commands.LowerPlunger;
import RobotsAreCool.commands.RaisePlunger;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick lJoystick = new Joystick(1), rJoystick = new Joystick(2);
    
    public Joystick jLeftWheel = lJoystick;
    public int leftAxis = 2;
    public Joystick jRightWheel = rJoystick;
    public int rightAxis = 2; 
    
    public JoystickButton suctionPlungerOn = new JoystickButton(rJoystick, 2),
            suctionPlungerOff = new JoystickButton(rJoystick, 4),
            lowerPlunger = new JoystickButton(rJoystick, 3), 
            raisePlunger = new JoystickButton(rJoystick, 5),
            fireFrisbee = new JoystickButton(rJoystick, 1), 
            autoAim = new JoystickButton(lJoystick, 3),
            autoShootSpeed = new JoystickButton(lJoystick, 2),
            autoShoot = new JoystickButton(lJoystick, 1);
            
    public OI()
    {
     suctionPlungerOn.whileHeld(new ActivatePlunger());   
     suctionPlungerOff.whileHeld(new DeactivatePlunger());  
     lowerPlunger.whenPressed(new LowerPlunger());
     raisePlunger.whenPressed(new RaisePlunger());
     fireFrisbee.whileHeld(new FireFrisbee());
     autoAim.whileHeld(new AutoAim());
     autoShootSpeed.whileHeld(new AutoShootSpeed());
     autoShoot.whileHeld(new AutoShoot());
    }
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

