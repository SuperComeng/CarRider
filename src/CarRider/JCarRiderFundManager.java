package CarRider;

import java.awt.Graphics;

import javax.swing.JPanel;

public class JCarRiderFundManager extends JPanel {
	public JCarRiderFundManager() {
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("준비중입니다.", 100, 100);
	}
}
