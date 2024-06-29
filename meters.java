import java.util.*;
class meters
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double inches,meters;
System.out.println("enter inches");
inches=sc.nextDouble();
meters=inches*0.0254;
System.out.println("inches converts to meters="+meters);       
}
}