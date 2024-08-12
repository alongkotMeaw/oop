package midBook;

public class Customer {
	private String code;
	private String name;
	//private String type;
	private Book bookIn[];
	private int limit;
	private int count = 0;
	
	public Customer(String code , String name) {
		this.code = code;
		this.name = name;
	}
	public Customer(String code , String name,String type) {
		this.code = code;
		this.name = name;
		limit = found(type);
		bookIn = new Book[limit];
	}
	public void addBook(Book add) {
		bookIn[count] = add;
		count++;
	}
	
	public void printall() {
		for(int round = 0; round < count ;round++) {
	    	System.out.print("Found Book and brrow ID ");
		    System.out.println(bookIn[round].getCode() + ' ' + bookIn[round].getBookName() + ' ' + bookIn[round].getName());
		    System.out.println(bookIn[round].getCode() + ' ' + bookIn[round].getBookName() + ' ' + bookIn[round].getName() + " borrow \n");
		}
	}
	
	//get index
	public int found(String type) {
		if(type == "Gold") return 4;
		else if(type == "Sliver") return 3;
		else return 2;
	}
	
	//set
	public void setType(String type) {
		limit = found(type);
		bookIn = new Book[limit];
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book[] getBookIn() {
		return bookIn;
	}
	public void setBookIn(Book[] bookIn) {
		this.bookIn = bookIn;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	

}
