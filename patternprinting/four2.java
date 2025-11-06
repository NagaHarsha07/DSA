import java.util.*;
public class four2 
{
    public static void function(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            
            }
            for(int j=1;j<=i+(i-1);j++)
            {
                System.out.print("*");
            
            }
            System.out.println();
        }
        
    //1  System.out.println();
        }
        public static void function1(int r)
        {
            for(int i=1;i<=r;i++)
            {
                for(int j=1;j<=i-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*r-(2*i);j++)
                {
                    System.out.print("*");
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
            function(r);
            function1(r);
        }
        sc.close();
    }
}