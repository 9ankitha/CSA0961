import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        
        int vowelCount = 0;
      
        statement = statement.toLowerCase();
        
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels in the given statement: " + vowelCount);
    }
}
