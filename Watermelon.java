import java.util.Scanner;
public class Watermelon {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        sc.close();
        if(weight % 2 == 0 && weight != 2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
//! all odds, 2, 6, 10, 14
//! 6 -> 2, 4| 10 -> 6, 4| 14 -> 8, 6