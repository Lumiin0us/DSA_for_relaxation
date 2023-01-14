import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
// import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.*;
public class EvenOddIncrements {
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
        int n, q; 
        int addNum;
        int numbers[];
        int flag = 0;
        long count; 

        for(int i = 0; i < t; i++)
        {
            n = sc.nextInt();
            q = sc.nextInt();
            numbers = new int[n];
            for(int j = 0; j < n; j++)
            {
                numbers[j] = sc.nextInt();
            }
            for(int k = 0; k < q; k++)
            {
                flag = sc.nextInt();
                addNum = sc.nextInt();
                count = 0;
                for(int x = 0; x < numbers.length; x++)
                {
                    if(flag == 0 & numbers[x] % 2 == 0) 
                {
                    
                    numbers[x] += addNum;
                    // count += numbers[x];
                }
                else if(flag == 1 && numbers[x] % 2 != 0)
                {
                    numbers[x] += addNum;
                    // count += numbers[x];
                }
                }
                for(int x = 0; x < numbers.length; x++)
                {
                    count += numbers[x];
                }
                System.out.println("Answers: " + count);
            }
        }
    }
}

//! 


