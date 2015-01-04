package currencyConverter;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ConverterPanel extends JPanel{
	ConverterPanel(){
		setBackground(Color.green);
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.drawLine(0,0,300,300);
		g.drawOval(50,50,50,80);
		g.drawString("Hello", 200,100);
		g.drawRect(100,200,100,50);
		
		int[] x = {10, 30, 60};
		int[] y = {50, 50, 50};
		g.drawPolygon(x, y, 3);

				
	} 
}
