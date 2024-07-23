package lap3;

public class TestBox {
	 public  static void resizeBox(Box b,int fold) { ///static เรียกโดยตรงได้ในฟังชันอื่น
			b.width = b.width*fold;
			b.height = b.height*fold;
			b.depth = b.depth*fold;
		}
	 
	 public static void main(String[] args) {
		 Box b = new Box(3 , 4 ,5);
		 resizeBox(b,2);
		 double s = b.getVolume();
		 System.out.println(s);
	 }
	 
	

}
