package Swingprogram;


	import javax.swing.*;
	import java.awt.*;

	public class ColorTabbedPaneCMY extends JFrame {
	    public ColorTabbedPaneCMY() {
	        setTitle("CMY Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("Cyan", cyanPanel);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("Magenta", magentaPanel);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        add(tabbedPane);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new ColorTabbedPaneCMY();
	    }
	}


