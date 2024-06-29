import java.util.Scanner;
public class odd {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number n: ");
int n = scanner.nextInt();
oddnumbers(n);
}
public static void oddnumbers(int n) {
System.out.println("Odd numbers " + n + " are:");
for (int i = 1; i < n; i += 2) {
System.out.println(i);
}
}
}