package reverse_string;

public class ReverseWordsTest{
	public boolean takesStringAndReturnsReversed(){
		// Arrange
		ReverseWords cut = new ReverseWords();
		String expectedResult = "tluser";

		// Act
		String result = cut.reverseString("result");

		// Assert
		System.out.println("Tests Passing:");
		return result == expectedResult;
	}
}
