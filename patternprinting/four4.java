import java.util.*;
public class four4 {
     public static void function1(int r)
    {
        
        for(int i=1;i<=r;i++)
        {
            int stars;
            if(r<i)
            {
                stars=2*r-i;
            }
            else
            {
                stars=i;
            }
            for(int j=1;j<=stars;j++)
            {
                  System.out.print("* ");
            }
            System.out.println();
        }
    }
   
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int r=sc.nextInt();
                function1(r);
            }
            sc.close();
        }
    }
