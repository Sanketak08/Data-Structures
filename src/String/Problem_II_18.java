package String;

public class Problem_II_18 {
    static String codes[] = {"2","22","222",
        "3","33","333",
        "4","44","444",
        "5","55","555",
        "6","66","666",
        "7","77","777","7777",
        "8","88","888",
        "9","99","999","9999"
    };
    public static void main(String[] args) {
        System.out.println(mobileNumericEquivalent("Hello world"));
    }
    
    public static String mobileNumericEquivalent(String str) {
        String res = str.toLowerCase();
        String result = "";
        for (int i = 0; i < res.length(); i++) {
            char ch = res.charAt(i);
            if (ch == ' ') {
                result += '0';
            } else {
                String code = codes[ch - 'a'];
                result += code;
            }
        }
        return result;
    }
}
