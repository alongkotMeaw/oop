package lap3;

public class Program {

	public static void main(String[] args) {
		Book book1 = new Book(); //create book
		//asian 
		book1.name = "Harry Potter and The Chamber of Secret";
		book1.author = "J.K. Rowling ";
		book1.year = 2542;
		
		//show
		System.out.println("Book: " + book1.name + "\n" + "Written by " + book1.author + "in " + book1.year);
				

	}

}

/*
เรียกมใช้ book ได้เพราะประกาศเป็น public
*/