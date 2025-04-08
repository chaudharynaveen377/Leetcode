package A_Copilot;

import java.util.Vector;

public class Freq_vector {
    public static void main(String[] args) {

                Vector<Integer> counter = new Vector<>(26);
                for (int i = 0; i < 26; i++) {
                    counter.add(0);
                }

                String text = "heeello world";
        System.out.println(Character.isLetter('y'));
        System.out.println((char)('a'+1));
                for (char c : text.toCharArray()) {
                    if (Character.isLetter(c)) {
                        int index = Character.toLowerCase(c) - 'a';
                        counter.set(index, counter.get(index) + 1);
                    }
                }

                // Print the frequency of each letter
                for (int i = 0; i < 26; i++) {
                    if (counter.get(i) > 0) {
                        System.out.println((char) ('a' + i) + ": " + counter.get(i));
                    }
                }
            }
        }



