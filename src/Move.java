import java.awt.*;

public class Move {
    Move(){
    }

    public void goToLocation(int x, int y){
        mouseGlide(x, y);
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
    public void mouseGlide(int x, int y) {
        try {
            int n = 10;
            int t = 1000;
            int curX = currentLocation()[0];
            int curY = currentLocation()[1];

            Robot robot = new Robot();
            double dx = (x - curX) / ((double) n);
            double dy = (y - curY) / ((double) n);
            for (int i = 1; i <= n; i++) {
                Thread.sleep(t);
                robot.mouseMove((int) (x + dx * i), (int) (y + dy * i));
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
