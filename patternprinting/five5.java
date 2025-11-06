import java.util.*;
public class five5
{
 public static void function1(int r) 
 {
    for(int i=1;i<=r;i++)
    {
        for(char ch='A'+i;ch>='A';ch--)
        {
             System.out.print(ch);
        }
    }
    System.out.println();
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
