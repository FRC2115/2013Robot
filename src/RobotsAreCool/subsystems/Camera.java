package RobotsAreCool.subsystems;

import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.camera.AxisCameraException;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.image.*;

public class Camera extends Subsystem 
{
    private AxisCamera axis;
    private ColorImage c1;
    private CriteriaCollection cc;

    public void initDefaultCommand() 
    {
        axis = AxisCamera.getInstance();
    }
        
    public void screenCap()
    {
        try 
        {
            if(axis.freshImage())
            {
                c1 = axis.getImage();
                cc.addCriteria(NIVision.MeasurementType.IMAQ_MT_AREA, 1.0f, 1.35f, false);

                BinaryImage b1 = c1.thresholdRGB(0, 255, 221, 255, 0, 255);
                BinaryImage b2 = b1.particleFilter(cc);
                BinaryImage b3 = b2.removeLargeObjects(false, 2);
                BinaryImage b4 = b3.removeSmallObjects(false, 6);
                BinaryImage b5 = b4.convexHull(true);
            }
            //setDefaultCommand(new MySpecialCommand());
            //setDefaultCommand(new MySpecialCommand());
        }
        catch (AxisCameraException ex)
        {
            ex.printStackTrace();
        } 
        catch (NIVisionException ex) 
        {
            ex.printStackTrace();
        }
    }
}
