
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
        int[] charFrequency = new int[256]; 
        for (char c : str.toCharArray()) {
            charFrequency[c]++;
        }
        char mostCommonChar = ' ';
        int maxFrequency = 0;

        for (char c : str.toCharArray()) {
            if (charFrequency[c] > maxFrequency) {
                mostCommonChar = c;
                maxFrequency = charFrequency[c];
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