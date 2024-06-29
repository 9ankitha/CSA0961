class Shape
{
	int r;
	void get()
	{
	r=5;
	}
	void cal()
	{
		System.out.println("r="+r);
	}
}
class sphere extends Shape
{
	double pi,area,volume;
	void get1()
	{
	pi=3.14;
	}
	void cal1()
	{
	area=4*pi*r*r;
	volume=1.33*pi*r*r*r;
	System.out.println("Area:"+area);
	System.out.println("Volume:"+volume);
	}
}
class cone extends sphere
{
	double pi,area,volume,h,l;
	void get2()
	{
	pi=3.14;
	h=2.5;
	l=3.5;
	}
	void cal2()
	{
	area=pi*r*(l+r);
	volume=0.33*pi*r*r*h;
	System.out.println("Area:"+area);
	System.out.println("Volume:"+volume);
	}
}
class cylinder extends cone
{
	double pi,area,volume,h;
	void get3()
	{
	pi=3.14;
	h=2.3;
	}
	void cal3()
	{
	area=2*pi*r*(h+r);
	volume=pi*r*r*h;
	System.out.println("Area:"+area);
	System.out.println("Volume:"+volume);
	}
}
class AreaTest
{
public static void main(String arg[])
{
	cylinder obj=new cylinder();

	obj.get();
	obj.get1();
	obj.get2();
	obj.get3();
	obj.cal();
	obj.cal1();
	obj.cal2();
	obj.cal3();
	
}
}