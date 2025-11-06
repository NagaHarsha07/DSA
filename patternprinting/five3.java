import java.util.*;
public class five3 {
    public static void function1(int r)
    {
        int num=1;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(num);
               num++; 
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
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
