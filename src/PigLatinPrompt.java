import java.util.Scanner;

public class PigLatinPrompt {//call in different class

	public static void main(String[] args) {
	
		Scanner	scnr = new Scanner(System.in);
	do {
		System.out.println("What word would you like to translat to Pig Latin?: ");
		String userWord = scnr.nextLine();
		userWord = userWord.replaceAll("'", ""); //gets rid of ' symbol
		String result = TDD_Pig_Latin.translate(userWord);
		System.out.println(result);	
		System.out.println("Would you like to translate another word?(y or n):");	
		String userDecision = scnr.nextLine();
		if(userDecision.equalsIgnoreCase("y"))
		{
			continue;
		}
		else
		{
			System.out.println("Goodbye.");
			break;
		}
		
	}while(true);
	
	scnr.close();
	
	}

}
