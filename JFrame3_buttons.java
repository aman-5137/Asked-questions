import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.*;

public class JFrame3_buttons {
     public static void main(String[] args) {

        JFrame frame = new JFrame("New Window");
        JLabel label = new JLabel("You just clicked Button.");
        JButton button = new JButton("Click");

        label.setForeground(Color.WHITE);
        label.setVisible(false);
        label.setLocation(130, 100);
        label.setSize(200,30);
//      add label to the frame


        button.setBackground(Color.white);
        button.setSize(70,30);
        button.addActionListener(e -> label.setVisible(true));//this will read the action performed on the button
        button.setLocation(155,140); // To set the location of the button on to the Window x and y coordinates
        button.setFocusable(false);// Allows us to remove border inside the button
//      add button to the frame

        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setVisible(true);// makes the window visible
        frame.setResizable(false);// won't be able to resize the window
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);// window starts from the mid of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(button);

    }
    
}
