import java.util.Arrays;
import java.util.Scanner;
 
public class HossamandCombinatorics {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arry[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arry[i]=sc.nextInt();
				
			}
			Arrays.sort(arry);
			long j=0,k=0;
			for(int i=0;i<n;i++)
			{
				if(arry[i]==arry[0])
					j++;
				else if(arry[i]==arry[n-1])
				     k++;
			}
			if(arry[0]==arry[n-1])
				System.out.println(j*(j-1));
			else
				System.out.println(2*(j*k));
		}
		
	}
}