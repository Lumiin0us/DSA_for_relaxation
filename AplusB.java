import java.util.Scanner;

public class AplusB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp;
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            exp = sc.next();
            sum(exp);
        }
        sc.close();
    }
public static void sum(String exp)
{
    char[] ch = exp.toCharArray();
    int sum = Character.getNumericValue(ch[0]) + Character.getNumericValue(ch[2]);
    System.out.println(sum);
}
}

//! a and b - [0-9]