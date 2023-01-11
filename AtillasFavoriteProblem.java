import java.util.*;
public class AtillasFavoriteProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        String str; 
        char[] ch;
        
        for(int i = 0; i < t; i++)
        {
            n = sc.nextInt();
            ch = new char[n];
            str = sc.next();
            for(int j = 0; j < n; j++)
            {
                ch = str.toCharArray();
            }
            findAscii(ch, n);
        }
        sc.close();
    }
    public static void findAscii(char ch[], int n)
    {
        int temp;
        int[] ascii = new int[n];
        for(int i = 0; i < n; i++)
        {
            ascii[i] = ch[i];
        }
        temp = ascii[0];
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(ascii[i] > ascii[j])
                {
                    temp = ascii[j];
                    ascii[j] = ascii[i];
                    ascii[i] = temp;
                }
            }
        }
        System.out.println(ascii[ascii.length-1] - 96);
    }
}
