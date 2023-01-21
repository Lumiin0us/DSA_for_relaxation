import java.util.*;
public class TNYMeetingFriends {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int min, mid, max;
		min = sc.nextInt();
		mid = sc.nextInt();
		max = sc.nextInt();

		if(min > mid && min < max || min > max && min < mid)
		{
			System.out.println((Math.abs(max - min) + Math.abs(min - mid)));
		}
		else if(mid > min && mid < max || mid > max && mid < min)
		{
			System.out.println((Math.abs(max - mid) + Math.abs(min - mid)));
		}
		else 
		{
			System.out.println((Math.abs(max - min) + Math.abs(max - mid)));
		}
		sc.close();
	}
}

//! 21 -- 5 -- 93