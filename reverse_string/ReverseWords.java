package reverse_string;
import java.util.ArrayList;

public class ReverseWords
{
	public static void main(String args[])
	{
		System.out.println(joinWordsReversed(separateWords("result here")));
	}

	public static ArrayList<String> separateWords(final String allWords)
	{
		ArrayList<String> separatedWords = new ArrayList<String>();
		int currentWordIndex = 0;
		String currentWord = "";

		for (int i = 0; i < allWords.length(); i++)
		{
			if (allWords.charAt(i) == ' ')
			{
				separatedWords.add(currentWord);
				currentWord = "";
				currentWordIndex++;
			}
			else
			{
				currentWord += allWords.charAt(i);
			}
		}
		
		separatedWords.add(currentWord);
		return separatedWords;
	}

	public static String joinWordsReversed(final ArrayList<String> separatedWords)
	{
		String result = "";
		
		for (int i = 0; i < separatedWords.size(); i++)
		{
			result += reverseString(separatedWords.get(i)) + ' ';
		}

		return result;
	}

	public static String reverseString(final String original)
	{
		String result = "";

		for (int i = original.length() -1; i >= 0; i--)
		{
			result += original.charAt(i);
		}
		
		return result;	
	}
}


