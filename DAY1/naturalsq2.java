import java.util.*;
public class naturalsq2
 {
  static int sum(int n)
  {
    return (n*(n+1)/2)*(2*n+1)/3;
  }  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum(n));
  }
}
