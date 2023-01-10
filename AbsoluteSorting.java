import java.util.*;

public class AbsoluteSorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str;
        for(int i = 0; i < t; i++)
        {
            str = sc.next();
            checkStr(str);
        }
        sc.close();
    }
    public static void checkStr(String str)
    {

    String realString = "YesYesYes";
    for(int i = 0; i < (str.length()/3); i++)
    {
        realString += "Yes";
    }
    if(realString.contains(str))
    {
        System.out.println("YES");
    }
    else
    {
      
            System.out.println("NO");
    }
       
    }
}


//! repeats yes many times in a row
//! (esY, YesYes, sYes, e) - when he answers YesYes
//! (Yess, YES, se) - cannot hear these 
