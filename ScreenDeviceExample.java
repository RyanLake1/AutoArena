import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class ScreenDeviceExample {
    public static void main(String[] args) {
        // Get the local graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Get an array of all screen GraphicsDevice objects
        GraphicsDevice[] screenDevices = ge.getScreenDevices();

        // Iterate through the screen devices and print their information
        System.out.println("Available Screen Devices:");
        for (int i = 0; i < screenDevices.length; i++) {
            GraphicsDevice device = screenDevices[i];
            System.out.println("Device " + (i + 1) + ":");
            System.out.println("  ID String: " + device.getIDstring());
            System.out.println("  Type: " + device.getType());
            System.out.println("  Default Configuration Bounds: " + device.getDefaultConfiguration().getBounds());
            System.out.println("  Full-Screen Exclusive Mode Supported: " + device.isFullScreenSupported());
        }
    }
}