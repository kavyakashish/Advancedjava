package adj4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	

	public class CountryButtonDemo extends JFrame implements ActionListener {
	    JButton btnIndia, btnSrilanka;
	    JLabel messageLabel;

	    public CountryButtonDemo() {
	        // Set frame properties
	        setTitle("Country Button Demo");
	        setSize(300, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Create buttons
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");

	        // Create label
	        messageLabel = new JLabel("Press a button...");

	        // Add action listeners
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	        // Add components to frame
	        add(btnIndia);
	        add(btnSrilanka);
	        add(messageLabel);

	        setVisible(true);
	    }

	    // Handle button click events
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnIndia) {
	            messageLabel.setText("India is pressed");
	        } else if (e.getSource() == btnSrilanka) {
	            messageLabel.setText("Srilanka is pressed");
	        }
	    }

	    // Main method to run the GUI
	    public static void main(String[] args) {
	        new CountryButtonDemo();
	    }
	}


