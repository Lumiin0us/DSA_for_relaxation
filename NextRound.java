import java.util.Scanner;
public class NextRound {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, k;
        int count = 0; 
        n = sc.nextInt();
        k = sc.nextInt();
        int scores[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            scores[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < scores.length; i++)
        {
            if(scores[i] >= scores[k-1] && scores[i] > 0)
            {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
//! score >= kth place -> advance to next round
//! n participants - each participant scores b/w [0 - 100]
//! sequence is decreasing or canstant which is something to take care of
