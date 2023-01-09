import java.util.*;

public class MatrixRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int nums[] = new int[4];
        for(int i = 0; i < t; i++)
        {
            // try {
            //     Thread.sleep(5);
            //   } catch (InterruptedException e) {
            //     Thread.currentThread().interrupt();
            //   }
            for(int j = 0; j < 4; j++)
            {
                nums[j] = sc.nextInt();
            }
            checker(nums);
            
        }
        sc.close();
    }
    public static void checker(int nums[])
    {
     
        int temp0, temp1, temp2, temp3;
        boolean flag = false;
        if(((nums[0] < nums[2]) && (nums[1] < nums[3])) && ((nums[0] < nums[1]) && (nums[2] < nums[3])))
        {
            flag = true;
            // System.out.println("Here");
        }
        //! 2--> 0, 0 --> 1, 1---> 3, 3--> 2;
        else
        {
            for(int i = 0; i < 4; i++)
            {
                temp0 = nums[0];
                temp1 = nums[1];
                temp2 = nums[2];
                temp3 = nums[3];
                nums[0] = temp2;
                nums[1] = temp0;
                nums[2] = temp3;
                nums[3] = temp1;
                if(((nums[0] < nums[2]) && (nums[1] < nums[3])) && ((nums[0] < nums[1]) && (nums[2] < nums[3])))
                {
                    flag = true;
                    // System.out.println(nums[0] + " " + nums[1]);
                    // System.out.println(nums[2] + " " + nums[3]);

                }
            }
        }
        if(flag == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}

//! 2x2 matrix - distinct ints
//! 1st element is smaller than 2nd(row)
//! 1st element smaller than 2nd(colm)
//! can only move 90deg
