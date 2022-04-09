package String;

public class Problem_II_25 {
    public static void main(String[] args) {
        System.out.println(firstRepeatedChar("abcdefacg"));
    }
    
    //* Bit manipulation
    // One integer is of 32 bits, we have to store the occurence of 26 characters
    // So we'll use bit manipulation to do this and check if that bit contains the character
    // if yes, we'll return the current index or we'll set that bit with current character
    public static int firstRepeatedChar(String s) {
        int checker = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return i;
            }

            checker |= (1 << val);
        }
        return -1;
    }
}
