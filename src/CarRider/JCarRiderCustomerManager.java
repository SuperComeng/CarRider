package CarRider;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class JCarRiderCustomerManager extends JPanel implements ActionListener {
	private	ArrayList<JCarRiderCustomer>	m_alCustomers;
	
	private	JButton	m_btnRegister;
	private	JButton	m_btnSearch;
	private	JButton	m_btnList;
	
	private	DefaultTableModel	m_tmCustomerList;
	private	JTable	m_tbCustomerList;
	
	public JCarRiderCustomerManager() {
		m_alCustomers = new ArrayList<JCarRiderCustomer>();
		
		CreateGUI();
		
		AddEventHandler();
		
		AdjustGUI();
	}
	
	public void CreateGUI() {
		m_btnRegister = new JButton("고객등록");
		m_btnSearch = new JButton("고객검색");
		m_btnList = new JButton("전체보기");
		
		String[] str = {"이름", "휴대전화번호", "E-mail"}; 
		
		m_tmCustomerList = new DefaultTableModel(str, 0);
		m_tbCustomerList = new JTable(m_tmCustomerList);
	}
	
	public void AddEventHandler() {
		m_btnRegister.addActionListener(this);
		m_btnSearch.addActionListener(this);
		m_btnList.addActionListener(this);
	}
	
	public void AdjustGUI() {
		JPanel pnBtn = new JPanel();
		pnBtn.setLayout(new GridLayout(1, 3));
		pnBtn.add(m_btnRegister);
		pnBtn.add(m_btnSearch);
		pnBtn.add(m_btnList);
		
		JScrollPane sPane = new JScrollPane(m_tbCustomerList);
		
		setLayout(new BorderLayout());
		add(pnBtn, BorderLayout.SOUTH);
		add(sPane, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(m_btnRegister)) {
			
		} else if (e.getSource().equals(m_btnSearch)) {
			
		} else if (e.getSource().equals(m_btnList)) {
			
		}
	}
}
