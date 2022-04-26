import java.util.Scanner;

public class PigLatinPrompt {//call in different class

	public static void main(String[] args) {
	
		Scanner	scnr = new Scanner(System.in);
		System.out.println("What word would you like to translat to Pig Latin?: ");
		String userWord = scnr.nextLine();
		userWord = userWord.replaceAll("'", ""); //gets rid of ' symbol
		String result = TDD_Pig_Latin.translate(userWord);
		System.out.println(result);	
		scnr.close();
	}

}
