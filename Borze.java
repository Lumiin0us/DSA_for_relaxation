import java.util.Scanner;
public class Borze {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String resultingString = "";
        sc.close();
        for(int i = 0; i < str.length();)
        {
           if(str.charAt(i) == '-' && str.charAt(i+1) == '-')
           {
                resultingString += Character.toString('2'); 
                i += 2;
           }
           else if(str.charAt(i) == '-' && str.charAt(i+1) == '.')
           {
                resultingString += Character.toString('1');
                i += 2;
           }
           else
           {
                resultingString += Character.toString('0');
                i += 1;
           }
        }
        System.out.println(resultingString);
    }
}
//! 0 = . || 1 = -. || 2 --