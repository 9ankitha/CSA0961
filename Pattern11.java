class Pattern11
{ 
      public static void main(String arg[])
      {
      for(int i=1;i<=5;i++)
      {
      for(int j=1;j<=i;j++)
      {
      System.out.print(i);
      }
      System.out.println(" ");
      }
      for(int i=5-1;i>=1;i--)
      {
      for(int j=1;j<=i;j++)
      { 
      System.out.print(i);
      } 
      System.out.println("");
      }
      }
}