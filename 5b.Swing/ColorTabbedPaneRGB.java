package Swingprogram;


	import javax.swing.*;
	import java.awt.*;

	public class ColorTabbedPaneRGB extends JFrame {
	    public ColorTabbedPaneRGB() {
	        setTitle("RGB Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);
	        tabbedPane.addTab("Red", redPanel);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);
	        tabbedPane.addTab("Blue", bluePanel);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);
	        tabbedPane.addTab("Green", greenPanel);

	        add(tabbedPane);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new ColorTabbedPaneRGB();
	    }
	}


