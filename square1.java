import java.util.*;
class square1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
float n,square_num,cube_num,fourth_num;
System.out.println("enter num");
n=sc.nextFloat();
square_num=n*n;
cube_num=square_num*n;
fourth_num=cube_num*n;
System.out.println("square of number="+square_num);       
System.out.println("cube of numbers="+cube_num);
System.out.println("fourth of number="+fourth_num);
}
}