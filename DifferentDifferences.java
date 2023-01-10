import java.util.*;

public class DifferentDifferences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k, n;
        for(int i = 0; i < t; i++)
        {
            k = sc.nextInt();
            n = sc.nextInt();
            createArr(k, n);
        }
        sc.close();
    }
    public static void createArr(int k, int n)
    {
        int count = 1;
        int x = 1;
        int dec = k - 1;
        int arr[] = new int[k];
        for(int i = 0; i < k; i++)
        {
             //! 1, 2, 4, 7   - 1 2 3 4 5 (1 - 2 - 4 - 7 - 11)
             //! n - k 
             //! k - x 
            if(n - count >= dec)
            // if(n - count < k)
            {
                dec--;
                arr[i] = count; // 1, 2 
                // System.out.print(count + " ");
                count = count + x;
                // System.out.print(count + " ");

                x+=1;
                
            }
            else if(n - count < dec && i != 0)
            {
                arr[i] = arr[i-1] + 1;
            }
            else
            {
                arr[i] = i+1;
            }
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//! t, testcases -- k and n (k - array of k ints from 1 - n)
//!max possible characterstics k >= 2 & <= n <= 40
//! 5 9 {1, 3, 4, 7, 8} {2 - 1 - 3 - 1} max - 3
//! 4 12 {2, 4, 7, 12} {2 - 3 - 5} max - 3
//! 4 6 {2, 4, 5, 6} {2 - 1 - 1} max - 2 

//! 5 9 {1, 2, 4, 7, 9} - {1, 2, 3, 2} check
//! 4 12 {1, 2, 4, 7} - {1, 2, 3} check
//! 4 6 {1, 2, 4, 6} - {1, 2, 2} check
//! 4 5 {1, 2, 4, 5} - {1, 2, 1}
//! 2 2 {1, 2}

//! cases: (1) k and n are equal (2) k < n (by how much!?)
