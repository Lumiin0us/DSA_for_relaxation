import java.util.*;
public class AntonAndPolyhedrons {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String str; 
		int count = 0;
		while(n > 0)
		{
			str = sc.next();
			if(str.equals("Tetrahedron"))
			{
				count += 4;
			}
			else if(str.equals("Cube"))
			{
				count += 6;
			}
			else if(str.equals("Octahedron"))
			{
				count += 8;
			}
			else if(str.equals("Dodecahedron"))
			{
				count += 12;
			}
			else
			{
				count += 20;
			}
			n--;
		}
		System.out.println(count);
		sc.close();
	}
}
