import java.util.*;
public class five1 {
    public static void function(int r)
    {
        int num=1;
        for(int i=1;i<=r;i++)
        {
            if(i%2==0)
            {
                num=0;
            }
            else
            {
                num=1;
            }
            for(int j=1;j<=i;j++)
            {
                 System.out.print(num+" ");
                 num=1-num;
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
        }
        sc.close();
    }
}
