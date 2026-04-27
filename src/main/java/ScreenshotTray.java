import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ScreenshotTray {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Screenshot Tray");
            JButton button = new JButton("Capture Screenshot");
            button.addActionListener(e -> {
                try {
                    ScreenCapture.capture();
                } catch (AWTException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            button.setBounds(150,200,200,70);
            frame.add(button);
            frame.setSize(500, 600);
            frame.setLayout(null);
            frame.setVisible(true);
        });
    }
}