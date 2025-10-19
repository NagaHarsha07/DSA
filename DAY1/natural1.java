import java.util.*;
public class natural1 
{
 static int findsum(int n)
 {
    return n*(n+1)/2;
 }   
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(findsum(n));
 }
}
