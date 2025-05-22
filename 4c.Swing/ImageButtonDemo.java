package adj4;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class ImageButtonDemo extends JFrame implements ActionListener {
	    JButton btnDigitalClock, btnHourGlass;
	    JLabel messageLabel;

	    public ImageButtonDemo() {
	        setTitle("Clock Selector");
	        setSize(400, 250);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        // Load images (make sure these files exist in your project directory)
	        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

	        // Create buttons with images
	        btnDigitalClock = new JButton(digitalClockIcon);
	        btnHourGlass = new JButton(hourGlassIcon);

	        // Add action listeners
	        btnDigitalClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Create label to display message
	        messageLabel = new JLabel("Press a button...");

	        // Add components to frame
	        add(btnDigitalClock);
	        add(btnHourGlass);
	        add(messageLabel);

	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnDigitalClock) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new ImageButtonDemo();
	    }
	}


