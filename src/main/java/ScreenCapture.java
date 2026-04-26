import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ScreenCapture {
    public static BufferedImage capture() throws AWTException, IOException {
        Rectangle screenRectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();
        BufferedImage screenCapture = robot.createScreenCapture(screenRectangle);
        return screenCapture;
    }
}
