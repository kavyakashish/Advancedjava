package Swingprogram;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.event.*;

	public class CountryListDemo extends JFrame {
	    // Declare components
	    JList<String> countryList;
	    JScrollPane scrollPane;

	    public CountryListDemo() {
	        setTitle("Country List");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Country names
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark", 
	            "France", "Great Britain", "Japan", "Africa", 
	            "Greenland", "Singapore"
	        };

	        // Create JList and wrap in scroll pane
	        countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        scrollPane = new JScrollPane(countryList);

	        // Add listener for list selection
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries: " + selected);
	                }
	            }
	        });

	        // Add scroll pane to frame
	        add(scrollPane);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryListDemo();
	    }
	}


