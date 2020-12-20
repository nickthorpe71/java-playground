public class SumOfDigits 
{
	public static void main(String args[])
	{
		System.out.println(digital_root(942));	
	}

	public static int digital_root(int n)
	{
		int total = 0;
		int currentNum = 0;
		while (n >= 10)
		{
			total = 0;
			currentNum = n;
			while  (currentNum > 0)
			{
				total += currentNum % 10;
				currentNum = currentNum / 10;
			}
			n = total;
		}
		return n;		
	}
}
