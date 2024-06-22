
import java.util.*;
class area1
{
      public static void main(String arg[])   
      {
             Scanner sc=new Scanner(System.in);
             int base,height;
             double area;
             System.out.println("enter base");
             base=sc.nextInt();
             System.out.println("enter height");
             height=sc.nextInt();
             area=0.5*height*base;
             System.out.println("area:"+area);
     }
}