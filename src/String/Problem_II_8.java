package String;

public class Problem_II_8 {
    public static void main(String[] args) {
        int result = binarySubstringCount("010100101");
        System.out.println("Result -> " + result);
    }
    
    static int binarySubstringCount(String s) {
        if (s.length() % 2 != 0) {
            return 0;
        }

        int substringCount = 0;
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '0') {
                zeroCount++;
            } else if (s.charAt(i) == '1') {
                oneCount++;
            }
            if (zeroCount == oneCount) {
                substringCount++;
                zeroCount = 0;
                oneCount = 0;
            }
        }

        return substringCount;
    }
}
