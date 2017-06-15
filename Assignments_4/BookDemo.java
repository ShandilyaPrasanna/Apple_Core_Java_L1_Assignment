package corejavaL1;

public class BookDemo {
	Book objBooks[] = new Book[2];
	void createBooks(){
		objBooks[0] = new Book();
		objBooks[0].setName("Gone with the wind");
		objBooks[0].setPrice(500);
		objBooks[1] = new Book();
		objBooks[1].setName("Java Programming");
		objBooks[1].setPrice(300);
	}
	void showBooks(){
		for(int i=0; i < objBooks.length; i++){
			System.out.println(objBooks[i].getName());
			System.out.println(objBooks[i].getPrice());
	}

}

	public static void main(String[] args){
		BookDemo objBookDemo = new BookDemo();
		objBookDemo.createBooks();
		objBookDemo.showBooks();
	}
	}