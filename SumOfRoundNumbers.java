import java.util.*;
public class SumOfRoundNumbers {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t, n;
		t = sc.nextInt();
		ArrayList<String> list;
		char[] ch;
		while(t > 0)
		{
			String str, zeros = ""; 
			int divisor = 1; 
			int mod = 1;
			str= sc.next(); 
			list = new ArrayList<String>();
			n = Integer.parseInt(str);
			ch = str.toCharArray();
			if( n != 1 || n!=  2 || n!= 3 || n!= 4 ||n!=  5 || n!= 6 || 
			n!= 7 ||n!= 8 || n!= 9)
			{
				for(int i = str.length(); i > 0; i--)
				{
					mod *= 10; 
					if(n % mod / divisor != 0)
					{
						list.add(Character.toString((ch[i - 1])) + zeros);
					}
					divisor *= 10; 
					zeros += "0";
				}
			}
			else 
			{
				list.add(Integer.toString(n));
			}
			System.out.println("\n" + list.size());
			for(int i = 0; i < list.size(); i++)
			{
				System.out.print(list.get(i) + " ");
			}
			t--;
		}
		sc.close();
	}
}
