import java.util.Arrays;
import java.util.HashMap;

public class TestAnagram {
    public boolean isAnagram(String s, String t){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean result;
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i) - 'a', map.getOrDefault(s.charAt(i)-'a', 0) + 1);
        }
        for (int i = 0; i < t.length(); i++){
            int temp = map.getOrDefault(t.charAt(i)-'a', 0) - 1;
            if (temp < 0) {
                return false;
            }
            else{
                map.put(t.charAt(i) - 'a', temp);
            }
        }

        return true;
    }

    public static void main(String[] args){
        int[] number = {1, 2, 3, 4};
//        String s = Arrays.toString(number).replaceAll("[^0-9]", "");
        String s = "anagram";
        String t = "anagrma";

        System.out.println("String S = " + s);
        for (int i : number)
            System.out.println(i);
        TestAnagram testAnagram = new TestAnagram();
        System.out.println(testAnagram.isAnagram(s,t));
    }
}
