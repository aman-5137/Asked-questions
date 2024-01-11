import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;

public class JFrame1_frame {
        public static void main(String[] args) {
        JFrame frame = new JFrame("New Window");
        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setVisible(true);// makes the window visible
        frame.setResizable(false);// wont be able to resize the window
        frame.setLocationRelativeTo(null);// window starts from the mid of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
