package midBook;

public class Book {
	private String code;
	private String bookName;
	private String name;

	public Book(String code, String bookName, String name) {
		this.code = code;
		this.bookName = bookName;
		this.name = name;
		//System.out.println(bookName);

	}

	// get set
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
