import java.util.Scanner;
class minmax{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter size of array");
int n=scanner.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scanner.nextInt();
}
int max=a[0];
int min=a[0];
for(int i=1;i<n;i++){
if(a[i]>max)
max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("max number"+max);
System.out.println("min number"+min);
System.out.println("sum of min and max"+(min+max));
System.out.println("diff of min and max"+(max-min));
}
}