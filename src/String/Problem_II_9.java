package String;

import java.util.Comparator;
import java.util.PriorityQueue;

class KeyComparator implements Comparator<Key> {
    public int compare(Key k1, Key k2){
        if (k1.freq < k2.freq)
            return 1;
        else if (k1.freq > k2.freq)
            return -1;
        return 0;
    }
}

class Key {
    int freq;
    char ch;

    Key(int val, char c) {
        freq = val;
        ch = c;
    }
}

public class Problem_II_9 {
    public static void main(String[] args) {
        String s = "kkk";
        rearrangeCharacters(s);
    }
    
    static void rearrangeCharacters(String s) {
        int[] count = new int[26];
        int n = s.length();

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        PriorityQueue<Key> queue = new PriorityQueue<>(new KeyComparator());
        for (char c = 'a'; c <= 'z'; c++) {
            int val = c - 'a';
            if (count[val] > 0) {
                queue.add(new Key(count[val], c));
            }
        }

        s = "";
        Key prev = new Key(-1, '#');

        while (queue.size() != 0) {
            Key k = queue.peek();
            queue.poll();
            s = s + k.ch;

            if (prev.freq > 0) {
                queue.add(prev);
            }

            (k.freq)--;
            prev = k;
        }

        if (n != s.length()) {
            System.out.println("Not possible");
        } else {
            System.out.println(s);
        }
    }
}
