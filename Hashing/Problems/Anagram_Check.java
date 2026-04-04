import java.util.HashMap;
public class Anagram_Check {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        // Count character in first string
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // Reduce count using Second String
        for(char ch : s2.toCharArray()){
            if( ! map.containsKey(ch)){
                System.out.println("Not Anagram");
                return;
            }
            map.put(ch,map.get(ch)-1);
        }
        // Check all values are 0
        for(int val : map.values()){
            if(val != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
