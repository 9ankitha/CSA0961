import java.util.*;
class sphere
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int r;
double pi,volume;
System.out.println("enter r");
r=sc.nextInt();
System.out.println("enter pi");
pi=sc.nextDouble();
volume=(1.33)*pi*r*r*r;
System.out.println("volume of sphere="+volume);
}
}