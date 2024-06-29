import java.util.*;
class quotient
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int dividend,divisor;
System.out.println("enter dividend");
dividend=sc.nextInt();
System.out.println("enter divisor");
divisor=sc.nextInt();
int quotient=dividend/divisor;
int remainder=dividend%divisor;
System.out.println("quotient:"+quotient);
System.out.println("remainder:"+remainder);
}
}