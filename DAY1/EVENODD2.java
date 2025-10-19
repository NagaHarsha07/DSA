import java.util.*;
public class EVENODD2 {
    public static boolean iseven(int n)
    {
        if((n & 1)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(iseven(n)==true)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    
}
