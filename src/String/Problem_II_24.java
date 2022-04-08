package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem_II_24 {
    public static void main(String[] args) {
        System.out.println(secondMaximum(new String[] { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" }, 6));
    }
    
    public static String secondMaximum(String[] arr, int N) {
        HashMap<String, Integer> occ = new HashMap<String,Integer>(arr.length){
            @Override
            public Integer get(Object key) {
                 return containsKey(key) ? super.get(key) : 0;
            }
        };
        
        for (int i = 0; i < arr.length; i++)
            occ.put(arr[i], occ.get(arr[i]) + 1);
      
       int first_max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
         
       Iterator<Map.Entry<String, Integer>> itr = occ.entrySet().iterator();
       while (itr.hasNext())
       {
           Map.Entry<String, Integer> entry = itr.next();
           int v = entry.getValue();
           if( v > first_max) {
                sec_max = first_max;
                first_max = v;
            }
      
            else if (v > sec_max &&
                     v != first_max)
                sec_max = v;
       }
        
       itr = occ.entrySet().iterator();
       while (itr.hasNext())
       {
           Map.Entry<String, Integer> entry = itr.next();
           int v = entry.getValue();
           if (v == sec_max)
                return entry.getKey();
       }
        
       return null;
    }
}
