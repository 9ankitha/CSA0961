import java.util.Scanner;

 class even
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of even Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int a = 0, b = 1, c, count = 0;
        System.out.println("Even Fibonacci numbers:");
        while (count < n) {
            c = a + b;
            if (c % 2 == 0) {
                System.out.print(c + " ");
                count++;
            }
            a = b;
            b = c;
        }
    }
}