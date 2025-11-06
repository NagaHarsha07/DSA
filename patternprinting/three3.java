import java.util.*;

public class three3 {
    public static void function(int r)
    {
        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=r;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int r=sc.nextInt();
            function(r);
        }
    }
}
