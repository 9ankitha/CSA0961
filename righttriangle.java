import java.util.*;
class righttriangle
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      int a,b,c,s;
      double area;
      System.out.println("enter s");
      s=sc.nextInt();
      System.out.println("enter a");
      a=sc.nextInt();
      System.out.println("enter b");
      b=sc.nextInt();
      System.out.println("enter c");
      c=sc.nextInt();
      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("area of triangle="+area);       
      }
}