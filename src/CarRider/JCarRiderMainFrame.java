package CarRider;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JCarRiderMainFrame extends JFrame {
	private	JTabbedPane					m_pnMainPanel;
	private	JCarRiderItemManager		m_pnItemManager;
	private	JCarRiderCustomerManager	m_pnCustomerManager;
	private	JCarRiderFundManager		m_pnFundManager;
	
	public JCarRiderMainFrame() {
		m_pnItemManager = new JCarRiderItemManager();
		m_pnCustomerManager = new JCarRiderCustomerManager();
		m_pnFundManager = new JCarRiderFundManager();
		
		m_pnMainPanel = new JTabbedPane();
		m_pnMainPanel.addTab("惑前包府", m_pnItemManager);
		m_pnMainPanel.addTab("绊按包府", m_pnCustomerManager);
		m_pnMainPanel.addTab("犁沥包府", m_pnFundManager);
		
		add(m_pnMainPanel);
		setTitle("Car Rider Manager");
	}
	public static void main(String[] args) {
		JCarRiderMainFrame frame = new JCarRiderMainFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
