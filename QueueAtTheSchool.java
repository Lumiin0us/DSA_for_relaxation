import java.util.Scanner;
public class QueueAtTheSchool {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, t;
        n = sc.nextInt();
        t = sc.nextInt();
        String str = sc.next();
        char temp = '.';
        char children[] = new char[n];
        children = str.toCharArray();
        sc.close();
        for(int i = 0; i < t; i++)
        {
            for(int j = 0; j < children.length - 1; j++)
            {

                    if(children[j] == 'B' && children[j+1] == 'G')
                    {
                        temp = children[j+1];
                        children[j+1] = children[j];
                        children[j] = temp;
                        j+=1;
                    }
            }
        }
        for(int i = 0; i < children.length; i++)
        {
            System.out.print(children[i]);
        }
    }
}
//! position in queue 1 - n (not-0)
//! pos 1 is served first
//! i-th pos at x-time (boy) and i+1 pos (girl) then 
//! nextt second(x+1) they will swap 