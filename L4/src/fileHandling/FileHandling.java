package fileHandling;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileHandling {

	private JFrame frame;
	private JTextField textField;

	private String blogIt(String blogContent){
		Date date = new Date();
		String finalBlogContent = new String("<html>\n" +date+ "\n<br>" + blogContent + "\n</html>");
		return finalBlogContent;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileHandling window = new FileHandling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FileHandling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Happy Blogging");
		frame.setBounds(0, 0, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea jTextFieldContent = new JTextArea();
		JButton jButtonBlog = new JButton("Blog It!");
		jButtonBlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String blogContent = jTextFieldContent.getText();
				String output = blogIt(blogContent);
				System.out.println(output);
				try {
					PrintWriter out = new PrintWriter("index.html");
					out.println(output);
					out.close();					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jButtonBlog.setBounds(327, 16, 117, 29);
		frame.getContentPane().add(jButtonBlog);
		
		//JTextField jTextFieldContent = new JTextField();
		jTextFieldContent.setBounds(14, 21, 301, 233);
		frame.getContentPane().add(jTextFieldContent);
		jTextFieldContent.setColumns(10);
	}
}
