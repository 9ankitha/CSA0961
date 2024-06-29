import java.util.*;
class area2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int r;
Double pi,area;
System.out.println("enter r");
r=sc.nextInt();
System.out.println("enter pi");
pi=sc.nextDouble();
area=pi*r*r;
System.out.println("area of circle="+area);
}
}