// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.*;
public class Advantage {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = sc.nextInt();
        int n;
        int arr[];
        for(int i = 0; i < t; i++)
        {
            n = sc.nextInt();
            arr = new int[n];
            for(int j = 0; j < n; j++)
            {
                arr[j] = sc.nextInt();
            }
            // checkStrength(arr);
            
        int max = 0;
        int secondMax = 0;
        int placeholder = 0; 
        int[] nums = arr.clone();
        
        for(int k = 0; k < 2; k++) //[3,4,1,5,2]
        {
            for(int j = k + 1; j < arr.length; j++)
            {
                if(arr[k] < arr[j])
                {
                    placeholder = arr[k];
                    arr[k] = arr[j];
                    arr[j] = placeholder;
                }
            }
        }
        max = arr[0];
        secondMax = arr[1];
        for(int k = 0; k < nums.length; k++) 
        {
            if(nums[k] != max)
            {
                nums[k] = nums[k] - max;
            }
            else
            {
                nums[k] = nums[k] - secondMax;
            }
        }
        // out.print("\nMAX: " + max);
        // out.print("\nSecondMax: " + secondMax);
        for(int k = 0; k < nums.length; k++)
        {
            out.print(nums[k] + " ");
        }
        out.println();
        out.flush();
        }
    }
}

//! n - participants[length of array], ith participant has s[i] strength
//! array elements are strengths.
//! j - strongest participant, s[j] most strength
//! i >= 1 && i <= n;
//! output -> si - sj(any participant other than i)
