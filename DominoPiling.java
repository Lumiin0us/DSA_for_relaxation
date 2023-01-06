import java.util.Scanner;
public class DominoPiling {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        int total = m * n; 
        if(total % 2 == 0)
        {
            total /= 2; 
        }
        else 
        {
            total -= 1;
            total /= 2;
        }
        System.out.println(total);
    }  
}


//! board size = M x N, 16 >= N >= M >= 1
//! domino - 2 x 1 squares 
//! M = 2, N = 4, M x N = 8 
//! Rows == columns {}