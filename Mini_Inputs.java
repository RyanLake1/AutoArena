import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

/* @author Ryan Lake 9/1/2025
 * Needed:
 * Key Listener: user input to tell the program when to stop or begin.
 * Key Event: auto input keypresses to shortcut
 * Robot: mousePress, mouseRelease, mouseMove
 *      : image capture? Buffered image x = createScreenCapture(Rectangle screenRect)
 *                      or MultiResolutionImage x = createMultiResolutionScreenCapture(Rectangle screenRect)
 * 
 * java.imageio.ImageIO;    java.awt.image.BufferedImage; :arcs- Minesweeper-Solver
 *                                                          https://github.com/arcs-/Minesweeper-Solver
 */



class Mini_Inputs {

    static final int[] NEXT_BUTTON_LINE1 = {-950972,-885181,-819904,-754112,-754111,-754111,-885183,-819390,-753597,-687804};
    static final int[] NEXT_BUTTON_LINE2 = {-883643,-883388,-752572,-621245,-621499,-686779,-686779,-620986,-555193,-620216};
    static final int[] EXP = {-9288883,-9749428,-10079420,-10015428,-8437953,-4820906};

    class GenException extends Exception {

        public GenException(String message) {
            super(message);
        }

    }

     private Robot robot;


    public Mini_Inputs() throws GenException {
        
        try {
            robot = new Robot();
            // Determine where the game is
            // Union together the bounds of each screen for screenshot
            Rectangle screenRect = new Rectangle(0, 0, 0, 0);
            for (GraphicsDevice gd : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
                screenRect = screenRect.union(gd.getDefaultConfiguration().getBounds());
            }
            BufferedImage capture = robot.createScreenCapture(screenRect);
            printRGBCodeForImage("Next button");
            findRGBCodeInImage("arenaFullscreen", NEXT_BUTTON_LINE1);
            findRGBCodeInImage("arenaFullscreen", EXP);
            
            printRGBCodeForImage2("arenaFullscreen");
            





        } catch (AWTException e) {
            e.printStackTrace();
        }
            
            
    }

    /**
     * Finds the starting point of the minesweeper game board on the screenshot
     *
     * @param capture the screenshot
     * @return ZeroPoint
     *
    private Point findZero(BufferedImage capture) {
        for (int x = 0; x < capture.getWidth(); x++) {
            heightLoop:
            for (int y = 0; y < capture.getHeight(); y++) {
                if (capture.getRGB(x, y) == BLOCK_CLOSED[0]) {
                    for (int i = 1; i < BLOCK_SIDE; i++) {
                        if (capture.getRGB(x + i, y) != BLOCK_CLOSED[i]) continue heightLoop;
                    }
                    return new Point(x, y);
                }
            }
        }
        return null;
    }
    */
        
    public void passPriority() {
        System.out.println("Passing the turn!");
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        /*
        robot.mouseMove(clickMultiplier.x + x * BLOCK_SIDE, clickMultiplier.y + y * BLOCK_SIDE);
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        */
    }

    /*
    Debugging Methods
     */

    /**
     * Prints the RGB Code used for identification for a field as java code
     */
    static void printRGBCodeForImage(String name) {
        try {
            BufferedImage nextButton = ImageIO.read(new File("resources/" + name + ".jpg"));
            StringBuilder sb = new StringBuilder("static final int[] ");
            sb.append(name.toUpperCase());
            sb.append(" = {");
            for (int i = 0; i < 10; i++) {
                sb.append(nextButton.getRGB(i, 0));
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append("};");
            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * Finds the location of a given array of RGB codes (horizontal only currently)
     */
    static void findRGBCodeInImage(String name, int[] rbgs) {
        Graphics2D g2d = null;
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("resources/" + name + ".jpg"));
            g2d = image.createGraphics();
            int rgb = 0;
            System.out.println("Height: " + image.getHeight() + "\n");
            System.out.println("Width: " + image.getWidth() + "\n");
            System.out.println("Final color code: " + image.getRGB(1079, 610) + "\n");
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    if (image.getRGB(x, y) == rbgs[rgb]) {
                        if (rgb == rbgs.length - 1) {
                            System.out.println("Found code at " + x + ", " + y + "!\n");
                            rgb = 0;
                        }
                        else {
                            rgb += 1;
                            System.out.println("Potential at " + x + ", " + y + "!\n");
                            System.out.println("Color code: " + image.getRGB(x, y) + "\n");
                        }
                    }
                    else {
                        rgb = 0;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } try {
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.fillRect(1070, 610, 10, 2);
            File outputFile = new File("newImage.jpg");
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Image created and saved to newImage.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printRGBCodeForImage2(String name) {
        try {
            BufferedImage nextButton = ImageIO.read(new File("resources/" + name + ".jpg"));
            StringBuilder sb = new StringBuilder("static final int[] ");
            sb.append(name.toUpperCase());
            sb.append(" = {");
            for (int i = 1070; i < 1080; i++) {
                sb.append(nextButton.getRGB(i, 610));
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append("};");
            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedImage nextButton = ImageIO.read(new File("resources/" + name + ".jpg"));
            StringBuilder sb = new StringBuilder("static final int[] ");
            sb.append(name.toUpperCase());
            sb.append(" = {");
            for (int i = 1070; i < 1080; i++) {
                sb.append(nextButton.getRGB(i, 611));
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append("};");
            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            new Mini_Inputs();
        } catch (Mini_Inputs.GenException e) {
            e.printStackTrace();
        }
    }
}
