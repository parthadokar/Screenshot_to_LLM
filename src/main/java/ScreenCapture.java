import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenCapture {
    public static void capture() throws AWTException, IOException {
        Rectangle screenRectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capturedImage = new Robot().createScreenCapture(screenRectangle);
        ImageIO.write(capturedImage, "png", new File("screenshot.png"));
    }
}
