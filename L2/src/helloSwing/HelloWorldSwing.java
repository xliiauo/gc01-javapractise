package helloSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
	private static void createAndShowGUI(){
		//set up the window
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Hello World Label
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		//Display the window
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		//Scheduling a job for the event-dispatching thread
		//create and showing the app's GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});

	}

}
