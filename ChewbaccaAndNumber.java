import java.util.*;
public class ChewbaccaAndNumber {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String number = sc.next(); 
		// char ch[] = new char[number.length()];
		long numberInt = Long.parseLong(number);
		long mod = 1;
		long divisor = 1;
		long valueHolder; 
		String resultingString = "";
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i = 0; i < number.length(); i++)

		{
			mod *= 10;
			valueHolder = numberInt % mod / divisor;
			if(valueHolder >= 5 && i != number.length() - 1)
			{
				valueHolder = 9 - valueHolder;
			}
			else if(i == number.length() - 1 && valueHolder != 9 && valueHolder >= 5) 
			{
				valueHolder = 9 - valueHolder;
			}
			list.add(valueHolder);
			divisor *= 10;
		}
		for(int j = list.size() - 1; j >= 0; j--)
		{
			resultingString += list.get(j);
		}
		System.out.println(resultingString);
		sc.close();

	}
}

//! 4952 
//! 9 - 5  5 or greater we subtract - 9 
//! 1234 % 10 / 1 (4)