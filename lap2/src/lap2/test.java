package lap2;

public class test {

	public static void main(String[] args) {
		/*{
			 String str = "geekss@for@geekss";
		        String[] arrOfStr = str.split("@");
		 
		        for (String a : arrOfStr)
		            System.out.println(a);
			
		}*/
		
		String word = "I’m happy. You’re sad. I’m happy. You’re sad. I’m happy. You’re sad.";
		String newWord = word.replace("happy", "happy:)");
		newWord = newWord.replace("sad", "sad:(");
		 System.out.println(newWord);



	}

}
