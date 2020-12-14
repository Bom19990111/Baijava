package TestConnect;

public class Books {
	private int ID;
	private String Title;
	private float Price;
	
	public Books(int iD, String title, float price) {
		ID = iD;
		Title = title;
		Price = price;
	}

	public Books(String title, float price) {
		Title = title;
		Price = price;
	}

	public Books() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}
	
	
	
	
}
