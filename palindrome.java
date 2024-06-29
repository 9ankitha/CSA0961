class palindrome
{
public static void main(String arg[])
{
String str="mom";
String rev=" ";
char ch;
int n=str.length();
for(int i=n-1;i>=0;i--)
{
ch=str.charAt(i);
 rev=rev+ch;
}
if(rev.equals(str))
{
System.out.println("palindrome");
}
else
{
System.out.println(" not a palindrome");
}
}
}
