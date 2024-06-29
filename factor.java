import java.util.*;
class factor
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int i,num;
System.out.println("enter num");
num=sc.nextInt();
for(i=1;i<=100;i++)
{
if(num%i==0)
{
System.out.println(i);
}
}
System.out.println(i);
}
}

