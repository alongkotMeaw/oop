package midBook;

public class Libary {
	private String libaryName;
	private shelf shelfIn[];
	private int limit;
	private Book bFound;
	
	public Libary(String name,int x) {
		this.libaryName = name;
		this.shelfIn = new shelf[x];
		this.limit = x;
	}
	
	public void addShelf(shelf add ,int index) {
		shelfIn[index - 1] = add;
	}
	
	public void printInfo() {
		System.out.println("All book in libary: " + libaryName);
		for(int count = 0; count < limit ; count++) {
			shelfIn[count].printBook();
			//System.out.println("check shell");
		}
	}
	
	public Book getBook(Book add) {
		for(int count = 0; count < limit ; count++) {
			Book bFound = shelfIn[count].getBook(add);
			if(bFound != null) {
				return bFound;
			}
		}
		return null;
	}
	
	public Book getBook(String sh,Book add) {
		for(int count = 0; count < limit ; count++) {
			
			if(shelfIn[count].getShelfName() == sh) {
			   Book bFound = shelfIn[count].getBook(add);
			   if(bFound != null) {
				   return bFound;
				}
			}
		}
		return null;
	}
		
		
}

