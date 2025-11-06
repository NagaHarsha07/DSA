import java.util.*;
public class four {
    
    public static void function(int r)
    {
        
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i+1;j++)
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
                function(r);
            }
            sc.close();
        }
    }
