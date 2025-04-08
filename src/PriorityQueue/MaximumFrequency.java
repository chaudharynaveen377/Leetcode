package PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumFrequency {
    public static void main(String[] args) {
        String s="naveen";
        HashMap<Character,Integer> mp=new HashMap<>();

            for (char c : s.toCharArray()) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }

        PriorityQueue<Map.Entry<Character,Integer>> p=new PriorityQueue<>((a, b) -> {
            return b.getValue() - a.getValue();
        });
       p.addAll(mp.entrySet());
        StringBuilder ans=new StringBuilder();
        while (!p.isEmpty()) {
            Map.Entry<Character, Integer> entry = p.poll();
//            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
            ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        System.out.println(ans.toString());
    }
}
