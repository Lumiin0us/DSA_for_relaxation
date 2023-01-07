import java.util.Scanner;
public class InSearchOfAnEasyProblem {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int holder; 
        for(int i = 0; i < n; i++)
        {
            holder = sc.nextInt();
            count += holder;
        }
        sc.close();
        if(count > 0)
        {
            System.out.println("HARD");
        }
        else
        {
            System.out.println("EASY");
        }
    }
}
//! asked 'n' people, if atleast 1 person says its hard - problem changes