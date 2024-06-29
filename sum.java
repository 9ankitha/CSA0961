
class sum
 {
     public static void main (String arg[])
     {
     int no,rem,rev=0,sum=0,remm;
     no=2346;
     while(no!=0)
     {
     rem=no%10;
     rev=rev+rem;
     no=no/10;
    }
    if(rev>=10)
    {
     while(rev!=0)
     {
     remm=rev%10;
     sum=sum+remm;
     rev=rev/10;
     }
      System.out.println("sum of digits:"+sum);
     }
     else
     {
     System.out.println("sum of digits:"+sum);
     }
     }
 }
