import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.*;

public class JFrame2_label {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New Window");
        JLabel label = new JLabel("This sentence will be displayed. ");

        label.setHorizontalAlignment(JLabel.CENTER);// sentence will be in center Horizontally
        label.setVerticalAlignment(JLabel.CENTER);// sentence will be in center Vertically
        label.setForeground(Color.WHITE);
//        add label to the frame


        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);// makes the window visible
        frame.setResizable(false);// won't be able to resize the window
        frame.setLocationRelativeTo(null);// window starts from the mid of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(label);

    }
    
}
