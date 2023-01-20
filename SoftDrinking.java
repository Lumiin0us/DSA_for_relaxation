import java.util.*;
public class SoftDrinking {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n, k, l, c, d, p, nl, np;
		int t1, t2, t3;
		n = sc.nextInt();
		k = sc.nextInt();
		l = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		p = sc.nextInt();
		nl = sc.nextInt();
		np = sc.nextInt();
		t1 = k * l;
		t1 /= n;
		t2 = c * d;
		t3 = p / np;
		if(t1 < t2 && t1 < t3)
		{
			System.out.println(t1/n);
		}
		else if(t2 < t1 && t2 < t3)
		{
			System.out.println(t2/n);
		}
		else
		{
			System.out.println(t3/n);
		}
		sc.close();
	}
}

//! group of n friends, buy k bottles, each bottle has l litres
//! bought c limes and cut each of them into d slices
//! after that they found p grams of salt

//! for a toast we need (nl) mililitres of drink, a slice of lime
//! (np) grams of salt

//! GOAL: make as many toasts as you can provided they all drink the same
//! amount. How many toasts can each friend make? 
//! 

//! 3 friends-n / 4 bottles-k / 5 litres-l / 10 limes-c / 8 slices-d
//! 100gm salt-p
//! 3 litres of drink-nl / 1gm salt-np


//! 4*5 = 20ml (20/3 = 6 toasts) (k * l)
//! 10*8 = 80 // salt (100/1) = 100