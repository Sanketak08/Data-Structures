package String;

public class Problem_II_20 {
    public static void main(String[] args) {
        System.out.println(minimumSwaps("[]][]["));
    }

    public static int minimumSwaps(String s) {
        char[] ch = s.toCharArray();
        int minSwaps = 0;
        int imbalance = 0;
        int countOpen = 0;
        int countClose = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '[') {
                countOpen++;

                if (imbalance > 0) {
                    minSwaps += imbalance;
                    imbalance--;
                }
            } else if (ch[i] == ']') {
                countClose++;
                imbalance = (countClose - countOpen);
            }
        }

        return minSwaps;
    }
}
