import java.util.*;
class Evenfibonacci
{
public static void main(String args[])
{
	int n=4;
	int terms=2*n+1;
	int[]fib=new int[terms];
	fib[0]=0;
	fib[1]=1;
	for(int i=2;i<terms;i++)
	{
	fib[i]=fib[i-1]+fib[i-2];
	}
	int sum=0;
	for(int i=0;i<terms;i+=2)
	{
	sum+=fib[i];
	}
	System.out.println("Sum of Fibonacci numbers at even indexes up to term"+(terms-1)+"is:"+sum);
}
}