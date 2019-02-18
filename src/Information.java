import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Information extends KeyAdapter{
    Information(){

    }

    @Override
    public void keyPressed(KeyEvent event) {

        char ch = event.getKeyChar();

        if (ch == 'a' ||ch == 'b'||ch == 'c' ) {

            System.out.println(event.getKeyChar());

        }

        if (event.getKeyCode() == KeyEvent.VK_HOME || event.getKeyCode() == KeyEvent.VK_SHIFT) {
            Move move = new Move();
            System.out.println("x = "+move.currentLocation()[0]+", y = "+move.currentLocation()[1]);
        }
    }
}
