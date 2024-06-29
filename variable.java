import java.util.*;
class variable
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter a");
a=sc.nextInt();
System.out.println("enter b");
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping="+a);       
System.out.println("after swapping="+b);
}
}