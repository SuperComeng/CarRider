package CarRider;

import java.util.ArrayList;

public class JCarRiderManager {
	private ArrayList<JCarRiderCustomer>	m_alCustomers;
	private ArrayList<JCarRiderItem>		m_alItems;
	
	public JCarRiderManager() {
		m_alCustomers = new ArrayList<JCarRiderCustomer>();
		m_alItems = new ArrayList<JCarRiderItem>();
	}
	
	public void AddNewCustomer(JCarRiderContact contact) {
		JCarRiderCustomer customer = new JCarRiderCustomer(contact);
		m_alCustomers.add(customer);
	}
	
	public void AddNewItem(JCarRiderItem item) {
		m_alItems.add(item);
	}
}
