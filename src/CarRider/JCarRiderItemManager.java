package CarRider;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

public class JCarRiderItemManager extends JPanel implements ActionListener, MouseListener {
	private	ArrayList<JCarRiderItem>	m_alItems;
	
	///< attributes for graphic user interface
	private	JButton m_btnSearch;
	private	JButton	m_btnAdd;
	private	JButton	m_btnList;
	private	JButton	m_btnSale;
	
	private	JLabel	m_lbCategory;
	private	JLabel	m_lbModel;
	private	JLabel	m_lbDateOfSale;
	private	JLabel	m_lbPrice;
	private	JComboBox	m_cbCategory;
	private	JComboBox	m_cbModel;
	private	JTextField	m_tfDateOfSale;
	private	JTextField	m_tfPrice;
	
	private	JTable	m_tbItemList;
	private	DefaultTableModel	m_tmItemList;
	
	public JCarRiderItemManager() {
		String[] columnNames = {"카테고리",
                "모델명",
                "가격",
                "재고"};
		
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		
		///< create item list
		m_alItems = new ArrayList<JCarRiderItem>();
		
		///< create GUI
		m_lbCategory = new JLabel("카테고리");
		m_lbModel = new JLabel("모델명");
		m_lbDateOfSale = new JLabel("판매일자");
		m_lbPrice = new JLabel("가격");
		
		m_cbCategory = new JComboBox();
		m_cbModel = new JComboBox();
		m_tfPrice = new JTextField();
		m_tfDateOfSale = new JTextField();
		
		m_btnSale = new JButton("판매");
		m_btnSearch = new JButton("검색");
		m_btnAdd = new JButton("추가");
		m_btnList = new JButton("전체목록");

		///< add click event
		m_btnSale.addActionListener(this);
		m_btnSearch.addActionListener(this);
		m_btnAdd.addActionListener(this);
		m_btnList.addActionListener(this);
		
		///< create item list view
		m_tmItemList = new DefaultTableModel(data, columnNames);
		m_tbItemList = new JTable(m_tmItemList);
		JScrollPane sPane = new JScrollPane(m_tbItemList);
		m_tbItemList.addMouseListener(this);
		//m_tbItemList.getSelectionModel().addListSelectionListener(this);
				
		JPanel pnItemManager = new JPanel();
		pnItemManager.setLayout(new GridLayout(0, 2));
		pnItemManager.add(m_lbCategory);
		pnItemManager.add(m_cbCategory);
		pnItemManager.add(m_lbModel);
		pnItemManager.add(m_cbModel);
		pnItemManager.add(m_lbDateOfSale);
		pnItemManager.add(m_tfDateOfSale);
		pnItemManager.add(m_lbPrice);
		pnItemManager.add(m_tfPrice);
				
		JPanel pnBtnManager = new JPanel();
		pnBtnManager.setLayout(new GridLayout(1, 4));
		pnBtnManager.add(m_btnSale);
		pnBtnManager.add(m_btnAdd);
		pnBtnManager.add(m_btnSearch);
		pnBtnManager.add(m_btnList);
		
		setLayout(new BorderLayout());
		add(pnItemManager, BorderLayout.NORTH);
		add(pnBtnManager, BorderLayout.SOUTH);	
		add(sPane, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(m_btnAdd)) {
			JOptionPane.showMessageDialog(this, "해당 제품을 판매하시겠습니까?");

		} else if (obj.equals(m_btnList)) {
			
		} else if (obj.equals(m_btnSearch)) {
			
		} else if (obj.equals(m_btnList)) {
			
		}
	}
	
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(m_tbItemList)) {
			Object obj = m_tmItemList.getDataVector().elementAt(m_tbItemList.getSelectedRow());
			System.out.println(obj.toString());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}