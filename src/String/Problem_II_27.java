package String;

public class Problem_II_27 {
    public static void main(String[] args) {
        System.out.println(minFlipToMakeStringAlternate("0001010111"));
    }

    public static char flip(char ch) {
        return (ch == '0') ? '1' : '0';
    }

    public static int getFlipWithStartingCharcter(String str, char expected) {
        int flipCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != expected)
                flipCount++;
            expected = flip(expected);
        }
        return flipCount;
    }

    public static int minFlipToMakeStringAlternate(String str) {
        return Math.min(getFlipWithStartingCharcter(str, '0'),
                getFlipWithStartingCharcter(str, '1'));
    }

}
