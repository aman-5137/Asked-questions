import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.WindowConstants;
import java.awt.*;


public class JFrame4_JLayeredPane {
    public static void main(String[] args) {
        

        JFrame frame = new JFrame("New Window");
        JButton button = new JButton("->");
        JButton button2 = new JButton("<-");
        JLabel label1 = new JLabel("A Label");
        JLabel label2 = new JLabel("A Label");
        JLabel label3 = new JLabel("A Label");

        button.setBackground(Color.white);
        button.setSize(50,30);
        button.addActionListener(e -> label2.setVisible(false));
        button.setLocation(150,170); // To set the location of the button on to the Window x and y coordinates
        button.setFocusable(false);

        button2.setBackground(Color.white);
        button2.setSize(50,30);
        button2.addActionListener(e -> label2.setVisible(true));
        button2.setLocation(5,5); // To set the location of the button on to the Window x and y coordinates
        button2.setFocusable(false);

        label1.setOpaque(true);
        label1.setBackground(Color.black);
        label1.setBounds(50,50,200,200);
        label1.add(button2);

        label2.setOpaque(true);
        label2.setBackground(Color.gray);
        label2.setVisible(true);
        label2.setBounds(100,100,200,200);

        label3.setOpaque(true);
        label3.setBackground(Color.lightGray);
        label3.setBounds(150,150,200,200);
        label3.add(button);

        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0,0,350,350);
        pane.add(label1, Integer.valueOf(0));
        pane.add(label2, Integer.valueOf(1));
        pane.add(label3, Integer.valueOf(2));
//        layerPanes are not visible as they only contain components inside it.

        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label3.setForeground(Color.black);

        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);// makes the window visible
        frame.setResizable(false);// won't be able to resize the window
        frame.setLocationRelativeTo(null);// window starts from the mid of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(pane);
    }
}
