package midBook;

public class main {

	public static void main(String[] args) {
		Book book1 = new Book( "B001", "C/C++", "Brian W. Kernighan and Dennis M. Ritchie");
		Book book2 = new Book( "B002", "Java Programming", "Brett Spell");
		Book book3 = new Book( "B003", "Data structure and Algorithms", "Lipschutz");
		Book book3cx = new Book( "BG03", "Data structure and Algorithms", "Lipschutz");
		Book book4 = new Book( "B004", "The lord of the Ring I", "J.R.R Tokin");
		Book book5 = new Book( "B005", "The lord of the Ring II", "J.R.R Tokin");
		Book book6 = new Book( "B006", "The lord of the Ring III", "].R.R Tokin");
		Book book7 = new Book( "B007", "THE INSTITUTE", "Stephen King");
		Book book7EX = new Book( "B007", "THE INSTITUTE", "Stephen King");
		Book book8 = new Book( "B008", "THE SHINING", "Stephen King");
		
		shelf shelf1 = new shelf("S1", 2, 2);
		shelf1.addBook(book1);
		shelf1.addBook(book2);
		shelf1.addBook(book3);
		shelf1.addBook(book3cx);
		
		
		shelf shelf2 = new shelf("S2", 3, 3);
		shelf2.addBook(book4);
		shelf2.addBook(book5);
		shelf2.addBook(book6);
		shelf2.addBook(book4);
		shelf2. addBook(book5);
		shelf2.addBook(book6);
		shelf2. addBook(book7);
		shelf2. addBook(book7EX);
		shelf2. addBook(book8);
		
		Libary lib1 = new Libary("Center Library", 2);
		lib1.addShelf(shelf1,1);
		lib1.addShelf(shelf2,2);
		lib1.printInfo();
		
		Staff staff = new Staff("St01", "Vince", lib1);
		Customer cus1 = new Customer ("C01", "jnon");
		
		cus1.setType("Sliver");
		
		Customer cus2 = new Customer ( "c02", "TripleH", "Gold");
		Customer cus3 = new Customer("c03", "Ray");
		cus3.setType("Bronze");
		
		cus1.addBook( lib1. getBook(book1) ) ;
		cus1. addBook(lib1. getBook("S2", book8));
		cus1.addBook(lib1. getBook(book2));
		staff .checkOut(cus1);
		
		cus2.addBook(lib1. getBook(book3));
		cus2.addBook( lib1. getBook(book4));
		cus2.addBook(lib1.getBook("S1", book2));
		cus2.addBook(lib1.getBook( "S2", book8));
		staff. checkOut(cus2);
		
	}

}
