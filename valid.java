import java.util.*;
class valid
{
public static void main(String arg[])
{
String s1;
String s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter username");
s1=sc.nextLine();
System.out.println("reenter username");
s2=sc.nextLine();
if(s1.equals(s2))
{
System.out.println("valid username");
}
else
{
System.out.println("invalid username");
}
}
}