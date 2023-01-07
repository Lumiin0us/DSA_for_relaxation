import java.util.Scanner;
public class BeautifulYear {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int unit, ten, hundred, thousand;
        int num = sc.nextInt();
        num += 1; 
        unit = num % 10; 
        ten = num / 10 % 10;
        hundred = num / 100 % 10; 
        thousand = num / 1000 % 10;
        sc.close();
            while(true)
            {
                if( unit != ten && unit != hundred && unit != thousand
                    && ten != hundred && ten != thousand && hundred != thousand)
                {
                    System.out.println(Integer.toString(thousand) + 
                    Integer.toString(hundred) + Integer.toString(ten)
                    + Integer.toString(unit));
                    break;
                }
                else
                {
                    num += 1;
                    unit = num % 10; 
                    ten = num / 10 % 10;
                    hundred = num / 100 % 10; 
                    thousand = num / 1000 % 10;

                }
        }

    }
}
//! 1987 -- 1 
//! 2013 <1000 - 9000>