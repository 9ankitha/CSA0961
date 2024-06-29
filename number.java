import java.util.*;
class number
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter n");
      n=sc.nextInt();
      if(n==0)
      {
      System.out.println("n is a zero:"+n);       
      }
      else if(n>0)
      {
      System.out.println("n is positive:"+n);
      }
      else
      {
        System.out.println("n is negative:"+n);
      }
      }
}
