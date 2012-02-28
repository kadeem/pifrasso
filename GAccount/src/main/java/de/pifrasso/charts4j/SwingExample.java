package de.pifrasso.charts4j;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



import com.googlecode.charts4j.Data;
import com.googlecode.charts4j.GCharts;
import com.googlecode.charts4j.LineChart;
import com.googlecode.charts4j.Plot;
import com.googlecode.charts4j.Plots;

/**
* Example code for displaying a chart via Swing. This is an alternative
* to displaying charts via JSP and Servlet technology.
*
* @author Julien Chastang (julien.c.chastang at gmail dot com)
*/

public class SwingExample {

   /**
    * main
    *
    * @param s
    *            args not read.
    * @throws IOException
    */
	public static void main(final String[] args) {	
    
       Plot plot = Plots.newPlot(Data.newData(0, 66.6, 33.3, 100));
       LineChart chart = GCharts.newLineChart(plot);
       try {
		displayUrlString(chart.toURLString());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   /**
    * Display the chart in a swing window.
    *
    *
    * @param urlString
    *            the url string to display.
    * @throws IOException
    */
   private static void displayUrlString(final String urlString) throws IOException{
       JFrame frame = new JFrame();
       JLabel label = new JLabel(new ImageIcon(ImageIO.read(new URL(urlString))));
       frame.getContentPane().add(label, BorderLayout.CENTER);
       frame.pack();
       frame.setVisible(true);
   }
}
