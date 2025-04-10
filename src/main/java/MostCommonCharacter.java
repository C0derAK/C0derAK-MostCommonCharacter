import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()){
            throw new IllegalArgumentException("Input string must not be null or empty");  
        }
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        char mostCommonChar = ' ';
        int maxFrequency = 0;
        for (HashMap.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mostCommonChar;
    }
    public static void main(String[] args) {
        MostCommonCharacter mcc = new MostCommonCharacter();
        String testString = "hello world";
        System.out.println("Most common character: " + mcc.recurringChar(testString));
    }
}