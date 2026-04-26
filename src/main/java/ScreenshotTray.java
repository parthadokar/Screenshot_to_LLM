import java.awt.*;

public class ScreenshotTray {
    public static void main(String[] args) {
        if(!SystemTray.isSupported()) {
            System.out.println("SystemTray not supported");
            return;
        }
        final PopupMenu popupMenu = new PopupMenu();
        Image image = Toolkit.getDefaultToolkit().getImage("images/bulb.gif");
        final TrayIcon trayIcon = new TrayIcon(image, "Screenshot Tray");
        final SystemTray tray = SystemTray.getSystemTray();

        // pop-up menu components
        MenuItem aboutItem = new MenuItem("About");
        CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
        CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
        Menu displayMenu = new Menu("Display");
        MenuItem errorItem = new MenuItem("Error");
        MenuItem warningItem = new MenuItem("Warning");
        MenuItem infoItem = new MenuItem("Info");
        MenuItem noneItem = new MenuItem("None");
        MenuItem exitItem = new MenuItem("Exit");

        popupMenu.add(aboutItem);
        popupMenu.addSeparator();
        popupMenu.add(cb1);
        popupMenu.add(cb2);
        popupMenu.addSeparator();
        popupMenu.add(displayMenu);
        displayMenu.add(errorItem);
        displayMenu.add(warningItem);
        displayMenu.add(infoItem);
        displayMenu.add(noneItem);
        popupMenu.add(exitItem);

        trayIcon.setPopupMenu(popupMenu);

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("Tray Item could not be added.");
        }
    }
}
