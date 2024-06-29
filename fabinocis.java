class fabinocis
{
	public static void main(String arg[])
	{
	int a=0,b=1,c;
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=4;i++)
	{
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
	}
	}
}