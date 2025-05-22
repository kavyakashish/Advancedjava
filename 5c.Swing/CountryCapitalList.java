package Swingprogram;


	import javax.swing.*;
	import java.awt.*;
	import javax.swing.event.*;
	import java.util.*;

	public class CountryCapitalList extends JFrame {
	    JList<String> countryList;
	    HashMap<String, String> capitalMap;

	    public CountryCapitalList() {
	        setTitle("Country-Capital List");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Map of country-capital
	        capitalMap = new HashMap<>();
	        capitalMap.put("USA", "Washington, D.C.");
	        capitalMap.put("India", "New Delhi");
	        capitalMap.put("Vietnam", "Hanoi");
	        capitalMap.put("Canada", "Ottawa");
	        capitalMap.put("Denmark", "Copenhagen");
	        capitalMap.put("France", "Paris");
	        capitalMap.put("Great Britain", "London");
	        capitalMap.put("Japan", "Tokyo");
	        capitalMap.put("Africa", "No single capital");
	        capitalMap.put("Greenland", "Nuuk");
	        capitalMap.put("Singapore", "Singapore");

	        countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    for (String country : selected) {
	                        System.out.println(country + " -> " + capitalMap.get(country));
	                    }
	                }
	            }
	        });

	        add(new JScrollPane(countryList));
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryCapitalList();
	    }
	}


