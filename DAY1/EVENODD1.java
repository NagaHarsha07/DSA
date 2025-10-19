import java.util.*;
class EVENODD1
{
    public static boolean iseven(int n)
    {
        int rem=n%2;
        if(rem==0)
        {
            return true;
        }
        else{
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
            System.out.println("ODD");
        }
    }
}