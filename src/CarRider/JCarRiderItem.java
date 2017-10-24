package CarRider;

public class JCarRiderItem {
	private	String	m_strCategory;
	private	String	m_strModel;
	private	double	m_dbPrice;
	
	public JCarRiderItem(JCarRiderItem item) {
		SetCategory(item.GetCategory());
		SetModel(item.GetModel());
		SetPrice(item.GetPrice());
	}
	
	public void SetCategory(String category) {
		m_strCategory = category;
	}
	
	public String GetCategory() {
		return m_strCategory;
	}
	
	public void SetModel(String model) {
		m_strModel = model;
	}
	
	public String GetModel() {
		return m_strModel;
	}
	
	public void SetPrice(double price) {
		m_dbPrice = price;
	}
	
	public double GetPrice() {
		return m_dbPrice;
	}
}
