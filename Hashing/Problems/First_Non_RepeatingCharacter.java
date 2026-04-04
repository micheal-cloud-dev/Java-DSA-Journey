import java.util.HashMap;
public class First_Non_RepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabbcde";

        HashMap<Character,Integer> map = new HashMap<>();

        // Step 1: count frequency
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // Step 2: Find first char with frequency 1
        for(char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                System.out.println("First Non-repeating:  "+ch);
                return;
            }
        }
        System.out.println("No unique character");
    }
}
