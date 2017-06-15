package corejavaL1;

public class Book {
	String booktitle;
	float price;
	
	public void setName(String bookName){
		booktitle = bookName;
	}
	public void setPrice(float cost){
		price=cost;
	}
	public String getName() {
		return booktitle;
	}
	public float getPrice() {
		return price;
	}
}
