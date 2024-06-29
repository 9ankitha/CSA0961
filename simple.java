import java.util.*;
class simple
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int p,t;
double r,interest;
System.out.println("enter p");
p=sc.nextInt();
System.out.println("enter t");
t=sc.nextInt();
System.out.println("enter r");
r=sc.nextDouble();
interest=p*r*t/100;
System.out.println("simple interest="+interest);
}
}