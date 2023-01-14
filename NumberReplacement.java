import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
// import java.util.Scanner;
import java.util.StringTokenizer;

import java.io.*;
public class NumberReplacement {
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
        int length; 
        char chHolder;
        int numHolder;
        int numArr[];
        char resultingList[];
        char ch[];
        int count; 
        String str; 
        for(int i = 0; i < t; i++)
        {
            length = sc.nextInt();
            numArr = new int[length];
            resultingList = new char[length];
            for(int j = 0; j < length; j++)
            {
                numArr[j] = sc.nextInt();
            }
            str = sc.next();
            ch = str.toCharArray();
            count = 0; 
            for(int k = 0; k < ch.length; k++)
            {
                chHolder = ch[k];
                numHolder = numArr[k];
                for(int l = 0; l < ch.length; l++)
                {
                    if(numArr[l] == numHolder)
                    {
                        resultingList[l] = chHolder;
                    }
                }
            }
            for(int y = 0; y < ch.length; y++)
            {
                if(ch[y] == resultingList[y])
                {
                    count += 1;
                }
            }
           if(count == resultingList.length)
           {
               System.out.println("YES");
           }
           else
           {
               System.out.println("NO");
           }
        }
        
    }
}

//! given - array of n integers. It is called a valley IF there exists 
//! "EXACTLY ONE" subarray a(l...r)
//! l >= 0;
//! r >= l;
//! n - 1 >= r;


