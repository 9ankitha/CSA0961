import java.util.Scanner;

 class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter an N-digit number: ");
        long number = scanner.nextLong();
      
        int digitalRoot = findDigitalRoot(number);
        
        System.out.println("Sum of digits until single digit: " + digitalRoot);
    }
    
    private static int findDigitalRoot(long number) {
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return (int) number;
    }
   
    private static long sumOfDigits(long number) {
        long sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
