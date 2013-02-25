package RobotsAreCool.Templates;

import RobotsAreCool.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
    protected Joystick 
            lJoy = new Joystick(1),
            rJoy = new Joystick(2);
    
    private JoystickButton 
            suctionPlunger = new JoystickButton(lJoy, 1),
            plunger = new JoystickButton(lJoy, 2),
            fireFrisbee = new JoystickButton(rJoy, 1),
            spinLeft = new JoystickButton(lJoy, 4),
            spinRight = new JoystickButton(lJoy, 5);
            
            
//            autoAim = new JoystickButton(lJoystick, 3),
//            autoShootSpeed = new JoystickButton(lJoystick, 2),
//            autoShoot = new JoystickButton(lJoystick, 1);
            
            
    public OI()
    {
        suctionPlunger.whileHeld(new ActivatePlunger());
        plunger.whileHeld(new RaisePlunger());
        fireFrisbee.whenPressed(new FireFrisbee(0.5));
        spinLeft.whileHeld(new SpinArm(false));
        spinRight.whileHeld(new SpinArm(true));
    }
    
    public void call()
    {
        CommandBase.arm.setSpeed((lJoy.getRawAxis(3) + 1) / 4.0);
        CommandBase.shooter.set((rJoy.getRawAxis(3) + 1) / 2.0);
        CommandBase.chassis.driveWithJoystick(lJoy.getY(), rJoy.getY());
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

