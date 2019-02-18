import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JTextField textField = new JTextField();

        textField.addKeyListener(new Information());

        JFrame jframe = new JFrame();

        jframe.add(textField);

        jframe.setSize(400, 350);

        jframe.setVisible(true);

//        Move move = new Move();
//        int n = (int)(Math.random()*250) + 50;
//        System.out.println(n);
//        move.performAction(400, 300, n, 5);
    }
}
