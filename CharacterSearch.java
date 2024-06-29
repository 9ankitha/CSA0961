import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);
        
        boolean found = false;
        
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println("Character '" + searchChar + "' is present at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Character '" + searchChar + "' is not present in the string.");
        }
    }
}
