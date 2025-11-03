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
 * 
 *
 */



class Mini_Inputs {

    // x: 1620 - 1627, y: 1010      If matches, it is my priority.
    static final int[] MYPRIO = {-954322,-756945,-495313,-366037,-39634,-39115,-38594,-299966};

    // These are the dimensions of capture on my screen; I am currently sutting it up to run on normal full-screen Arena
    static final int IMAGE_HEIGHT = 1067;
    static final int IMAGE_WIDTH = 1707;

    class GenException extends Exception {

        public GenException(String message) {
            super(message);
        }

    }

     private Robot robot;


    public Mini_Inputs() throws GenException {
        
        try {
            int[] center_of_screen = {IMAGE_HEIGHT/2, IMAGE_WIDTH/2};
            robot = new Robot();
            // Determine where the game is
            // Union together the bounds of each screen for screenshot
            Rectangle screenRect = new Rectangle(0, 0, 0, 0);
            for (GraphicsDevice gd : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
                screenRect = screenRect.union(gd.getDefaultConfiguration().getBounds());
            }
            BufferedImage capture = robot.createScreenCapture(screenRect);

            if (isMyPriority(capture)) {

            }
            
            /*
            printRGBCodeForImage("Next button");
            findRGBCodeInImage("arenaFullscreen", NEXT_BUTTON_LINE1);
            findRGBCodeInImage("arenaFullscreen", EXP);
            */
            
            int[] int_arr = {1620, 1010, 8};
            printRGBCodeForImageLine("myPrio", int_arr);

            findRGBCodeInImage("myPrio", MYPRIO);

            custom_wait(robot, 3000);
            passPriority();

            /*
             * Print captured image:
            printRGBCodeForCapturedImage(capture);
            File outputFile = new File("myPrio.jpg");
            try {
                ImageIO.write(capture, "jpg", outputFile);
            } catch (IOException e) {
                System.out.println("Image creation failed");
                e.printStackTrace();
            }
            System.out.println("Image created and saved to myPrio.jpg");
             
             */
            
            





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
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_WINDOWS);
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
    static void printRGBCodeForImage(String name, int[] where) {
        try {
            BufferedImage nextButton = ImageIO.read(new File("resources/" + name + ".jpg"));
            StringBuilder sb = new StringBuilder("static final int[] ");
            sb.append(name.toUpperCase());
            sb.append(" = {");
            for (int y = where[1]; y < where[1] + where[3]; y++) {
                for (int x = where[0]; x < where[0] + where[2]; x++) {
                    sb.append(nextButton.getRGB(x, y));
                    sb.append(",");
                }
            }
            sb.setLength(sb.length() - 1);
            sb.append("};");
            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * Finds the location of a given array of RGB codes
     * 
     * Added on the bottom is code to display a square on the capture to tell where necessary coordinates are
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
                            System.out.println("Color code:  "+ image.getRGB(x, y) + "\n");
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
            g2d.setColor(Color.BLACK);
            g2d.fillRect(1620, 1010, 8, 1);
            File outputFile = new File("newImage.jpg");
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Image created and saved to newImage.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param name - name of file (jpeg)
     * @param coords - array of: x coord, y coord, line length
     */
    static void printRGBCodeForImageLine(String name, int[] coords) {
        try {
            BufferedImage nextButton = ImageIO.read(new File("resources/" + name + ".jpg"));
            StringBuilder sb = new StringBuilder("static final int[] ");
            sb.append(name.toUpperCase());
            sb.append(" = {");
            for (int i = coords[0]; i < coords[0] + coords[2]; i++) {
                sb.append(nextButton.getRGB(i, coords[1]));
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append("};");
            System.out.println(sb);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void printRGBCodeForCapturedImage(BufferedImage my_image) {
            System.out.println("Height: " + my_image.getHeight() + "\n");
            System.out.println("Width: " + my_image.getWidth() + "\n");
            StringBuilder sb = new StringBuilder("static final int[] ");
            sb.append("IMAGE NAME");
            sb.append(" = {");
            for (int i = 1070; i < 1080; i++) {
                sb.append(makeRGBHumanReadable(my_image.getRGB(i, 660)));
                sb.append(" || ");
            }
            sb.setLength(sb.length() - 4);
            sb.setLength(sb.length() - 1);
            sb.append("};");
            System.out.println(sb);

        
        
            StringBuilder sb2 = new StringBuilder("static final int[] ");
            sb2.append("IMAGE NAME TRY 2");
            sb2.append(" = {");
            for (int i = 1070; i < 1080; i++) {
                sb2.append(makeRGBHumanReadable(my_image.getRGB(i, 661)));
                sb2.append(" || ");
            }
            sb2.setLength(sb2.length() - 4);
            sb2.append("};");
            System.out.println(sb2);

    }

    static StringBuilder makeRGBHumanReadable(int pixelValue) {
        StringBuilder puny_human = new StringBuilder("{Transparency:");
        puny_human.append((pixelValue >> 24) & 0xff);
        puny_human.append(" R:");
        puny_human.append((pixelValue >> 16) & 0xff);
        puny_human.append(" G:");
        puny_human.append((pixelValue >> 8) & 0xff);
        puny_human.append(" B:");
        puny_human.append(pixelValue & 0xff);
        puny_human.append("}");
        return puny_human;
    }

    /**
     * 
     * @param capture
     * @return if I can play cards
     */
    boolean isMyPriority(BufferedImage capture) {
        int myPrioCount = 0;
        for (int x = 1620; x < 1628; x++) {
            if (capture.getRGB(x, 1010) == MYPRIO[x - 1620]) {
                myPrioCount++;
            }
        }
        if (myPrioCount == 8) {
            return true;
        }
        return false;
    }

    public void custom_wait(Robot robot, int milli) {
        synchronized (robot) {
            try {
                robot.wait(milli); // Correct usage
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
