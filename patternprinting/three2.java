import java.util.*;
public class three2{
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        //int c=sc.nextInt();
        int num=1;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
