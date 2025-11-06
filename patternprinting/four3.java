import java.util.*;
public class four3 
{
    public static void function1(int r)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void function2(int r)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<i;j++)
            {
                   System.out.print(" ");
            }
            for(int j=0;j<2*r-(2*i+1);j++)
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
            function1(r);
            function2(r);
        }
    }
}
