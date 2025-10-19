import java.util.*;
public class natural2
{
 static int findsum(int n)
 {
    if(n==1)
    {
        return 1;
    }
    return n+findsum(n-1);
 }   
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(findsum(n));
 }
}
