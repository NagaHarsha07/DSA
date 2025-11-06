import java.util.*;
public class four5 {
    public static void function1(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void function2(int r)
    {
        for(int i=1;i<=r-1;i++)
        {
            for(int j=1;j<=r-i;j++)
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
        sc.close();
    } 
}
