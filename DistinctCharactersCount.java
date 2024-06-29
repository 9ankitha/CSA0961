import java.util.HashMap;
import java.util.Map;

 class DistinctCharactersCount {
    public static void main(String[] args) {
        String input = "Hello, World!";
        
        Map<Character, Integer> charCountMap = findDistinctCharactersCount(input);
       
        System.out.println("Distinct characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> findDistinctCharactersCount(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }
}
