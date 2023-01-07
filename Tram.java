import java.util.Scanner;
public class Tram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b; 
        int count = 0; 
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            count -= a; // 0 1 2 0
            count += b; // 3 6 4 0 
            if(count > max)
            {
                max = count;
            }
        }
        sc.close();
        System.out.println(max);
        

    }
}
