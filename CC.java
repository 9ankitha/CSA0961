public class CC {
    public static void main(String[] args) {
        String input = "aBc123*";
        int u = 0;
        int l = 0;
        int n = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '*') {
                break;
            }
            if (Character.isUpperCase(ch)) {
                u++;
            } else if (Character.isLowerCase(ch)) {
                l++;
            } else if (Character.isDigit(ch)) {
                n++;
            }
        }
        System.out.println("Total count of lower case: " + l);
        System.out.println("Total count of upper case: " + u);
        System.out.println("Total count of numbers: " + n);
    }
}
