
class senior
 {
     public static void main (String arg[])
     {
     Scanner sc=new Scanner(System.in);
     double n,p,seniorcitizen,years,interest;
     System.out.println("enter p");
     p=sc.nextDouble();
     System.out.println("enter years");
     years=sc.nextDouble();
     System.out.println("enter seniorcitizen");
     seniorcitizen=sc.nextDouble();
     if(seniorcitizen=='y')
     {
     interest=(p*n*12)/100;
     System.out.println("simple interest:"+interest);
     }
     else if(seniorcitizen=='N')
     {
     interest=(p*n*10)/100;
     System.out.println("simple interest:"+interest);
     }
     else
     {
     System.out.println("Invalid input for senior citizen.");
     }
     }
 }
