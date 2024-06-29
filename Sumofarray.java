import java.util.*;
class Sumofarray 
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int sum=0,i,n;
System.out.println("enter no.of values:");
n=sc.nextInt();
System.out.println("enter array of elements:");
int a[]=new int[n];
try
{
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("sum:"+sum);
}
catch(Exception ex)
{
System.out.println("more than n values");
System.out.println("change n value");
}
finally {
System.out.println("always executed");
}
}
}