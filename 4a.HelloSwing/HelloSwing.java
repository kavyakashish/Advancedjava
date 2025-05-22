package adj4;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {
	
	    public static void main(String[] args) {
	        // Create a new frame
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create a label with the message
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", JLabel.CENTER);

	        // Set font: plain style, size 32
	        label.setFont(new Font("Serif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add label to the frame
	        frame.add(label);

	        // Set frame size
	        frame.setSize(700, 200);

	        // Close operation
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Center the frame on screen
	        frame.setLocationRelativeTo(null);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}