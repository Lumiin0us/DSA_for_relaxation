import java.util.*;
import java.util.Scanner;
public class IWannaBeTheGuy {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        int val[] = new int[n];
        for(int i = 0; i < p; i++)
        {
            list.add(sc.nextInt());
        }
        int sec = sc.nextInt();
        for(int i = 0; i < sec; i++)
        {
            list.add(sc.nextInt());
        }
        sc.close();
        for(int i = 0; i < n; i++)
        {
            val[i] = i + 1;
        }
        for(int i = 0; i < val.length; i++)
        {
            for(int j = 0; j < list.size(); j++)
            {
                if(val[i] == list.get(j))
                {
                    count += 1;
                }
            }
        }
        if(count != n)
        {
            System.out.println("Oh, my keyboard!");
        }
        else
        {
            System.out.println("I become the guy.");
        }
    }
   
}
//! game has 'n' - levels 
//! x - can pass 'p' levels
//! y - can pass 'q' levels

//! given: indices of levels they can pass
//! will they pass the whole game if they cooperate with eachother?
