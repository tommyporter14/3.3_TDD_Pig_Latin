
public class TDD_Pig_Latin {

	public static void main(String[] args) {

		String word = "apple";
		System.out.println(translate(word));
		
	}

	public static String translate(String word)//translate words to pig latin
	{
		String lowerWord = word.toLowerCase();
		int i = getVowelIndex(lowerWord);
		String translatedWord = "";
		if (i == 0)//starts with vowel
		{
			translatedWord = lowerWord + "way";
			return translatedWord;
		}
		else if (i > 0)//starts with consonants
		{
			translatedWord = lowerWord.substring(i) + lowerWord.substring(0, i) + "ay";
		}
		else
		{
			translatedWord = lowerWord;//no vowel
		}
		return translatedWord;
	}
	
	public static boolean isVowel(char c)//define what vowels are
	{
		return (c == 'a' || c == 'e'|| c == 'i'|| c == 'o' || c == 'u');
	}
	
	public static int getVowelIndex (String word)//find index of first vowel
	{
		int stringlength=word.length();      
		for (int i=0; i<stringlength; i++)
		{
			if (isVowel(word.charAt(i)))
			{ 
				return i;
			}
			
		}
		return -1;
	}
}
