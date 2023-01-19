import java.util.Arrays;
import java.util.Scanner;
 
public class Bit {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int X = 0; 
		String statement; 
		while(n > 0)
		{
			statement = sc.next();
			if(statement.equals("X++"))
			{
				X++; 
			}
			else if(statement.equals("++X"))
			{
				++X;
			}
			else if(statement.equals("X--"))
			{
				X--;
			}
			else
			{
				--X;
			}
			n--; 
		}
		System.out.println(X);

	}
}

//! ++x || x++ || --x || x--