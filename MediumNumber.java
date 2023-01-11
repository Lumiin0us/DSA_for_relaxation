import java.util.*;
public class MediumNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c;
        for(int i = 0; i < t; i++)
        {
            a = sc.nextInt(); //  6 5 2 || 5-2-6 || 2-5-6 ||6-2-5
            b = sc.nextInt(); // 19 8 4 || 8 19 4 || 8 4 19 || 
            c = sc.nextInt();
            if(a > b && a < c || a > c && a < b)
            {
                System.out.println(a);
            }
            else if(b < a && b > c || b > a && b < c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }

        }
        sc.close();
    }
}
