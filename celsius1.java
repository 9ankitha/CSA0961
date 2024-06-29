import java.util.*;
class celcius
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double celcius,farenheit;
System.out.println("enter farenheit");
farenheit=sc.nextDouble();
celcius=(farenheit-32)*0.55;
System.out.println("farenheit to celcius="+celcius);
}
}