package radarGraph;

import java.awt.GridLayout;

import javax.swing.JLabel;

public class RadarLabel extends JLabel{

	JLabel jlbLabel1, jlbLabel2, jlbLabel3;
	public RadarLabel(){

		setLayout(new GridLayout(3, 1));

		jlbLabel1 = new JLabel("availability");
		jlbLabel1.setVerticalTextPosition(JLabel.TOP);
		jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);

		jlbLabel2 = new JLabel("usability");
		jlbLabel3 = new JLabel("cost");

		add(jlbLabel1);
		add(jlbLabel2);
		add(jlbLabel3);

	}

}
