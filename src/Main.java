import javax.swing.*;
import java.awt.Frame;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new Hello().panel1);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(600, 600);
        jFrame.setVisible(true);
    }
}