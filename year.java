import java.util.*;
class year
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      int year;
      System.out.println("enter year");
      year=sc.nextInt();
      if(year%4==0)
      {
      System.out.println("leapyear:"+year);       
      }
      else
      {
      System.out.println("not leapyear:"+year); 
      }
      }
}
