package midBook;

public class shelf {
	private Book shellBook[][];
	private String shelfName;
	private int countBook = 0;
	private int x;
	private int y;
	private int xCount = 0;
	private int yCount = 0;

	public shelf(String name, int x, int y) {
		this.shelfName = name;
		shellBook = new Book[x][y];
		this.x = x;
		this.y = y;
	}

	public void addBook(Book add) {
		if (y > yCount) {
			this.shellBook[xCount][yCount] = add;
			//System.out.println(add.getName());
			//System.out.println(add.getName() + "index " + xCount + yCount);
			yCount++;
		} else {
			xCount++;
			yCount = 0;
			this.shellBook[xCount][yCount] = add;
			//System.out.println(add.getName() + "index " + xCount + yCount);
			yCount++;	
		}
		if(xCount == y && yCount == y) System.out.println("\n\n");
		
		
	}

	public void printBook() {
		//System.out.println("check call book "+ xCount + yCount);
		for (int xP = 0; xP <= xCount; xP++) {
			for (int yP = 0; yP < yCount; yP++) {
				//System.out.println("count = " + xP + P);
				System.out.println("ID: " + shellBook[xP][yP].getCode() + " Name:" + shellBook[xP][yP].getBookName() + ' '+ shellBook[xP][yP].getName()+ "Position (row,lock) " + '(' + (xP+1) + ',' + (yP+1) + ')');
			}
			
		}
		System.out.println("\n\n");

	}
	public Book getBook(Book B) {
		for (int xP = 0; xP <= xCount; xP++) {
			for (int yP = 0; yP < yCount; yP++) {
			    if(B.equals(shellBook[xP][yP]))
			       return shellBook[xP][yP];
			}
			
		}
		return null;
	}
	
	

	
	
	
	
	public String getShelfName() {
		return shelfName;
	}

	public void setShelfName(String shelfName) {
		this.shelfName = shelfName;
	}

	public Book[][] getShellBook() {
		return shellBook;
	}

	public void setShellBook(Book[][] shellBook) {
		this.shellBook = shellBook;
	}

	public int getxCount() {
		return xCount;
	}

	public void setxCount(int xCount) {
		this.xCount = xCount;
	}

	public int getyCount() {
		return yCount;
	}

	public void setyCount(int yCount) {
		this.yCount = yCount;
	}
}
