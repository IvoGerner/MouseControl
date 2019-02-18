import java.awt.*;

public class Move {
    private static Robot robot;
    Move(){
    }

    public void performAction(int x, int y, int n, int t){
        mouseGlide(x, y, n, t);

    }
    public int[] currentLocation(){
        int curArray[] = new int[2];
        Point location = MouseInfo.getPointerInfo().getLocation();
        int curX = (int) location.getX();
        int curY = (int) location.getY();
        curArray[0] = curX;
        curArray[1] = curY;
        return curArray;
    }
    public void mouseGlide(int x, int y, int n, int t) {
        try {
            int curX = currentLocation()[0];
            int curY = currentLocation()[1];

            robot = new Robot();
            double dx = (x - curX) / ((double) n);
            double dy = (y - curY) / ((double) n);
            for (int i = 1; i <= n; i++) {
                Thread.sleep(t);
                robot.mouseMove((int) (curX + dx * i), (int) (curY + dy * i));
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void keystroke(int key) {
        robot.keyPress(key);
        robot.delay(100); // hold for a tenth of a second, adjustable
        robot.keyRelease(key);
    }
}
