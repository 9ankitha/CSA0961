class CharPresence {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char target = 'u';
        boolean isPresent = false;
	
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("The character '" + target + "' is present in the string.");
        } else {
            System.out.println("The character '" + target + "' is not present in the string.");
        }
    }
}


