import java.util.HashMap;
public class Frequency_Count {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        // Count frequency
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // print result
        for(int Key : map.keySet()){
            System.out.println(Key+"-->"+map.get(Key));
        }
    }
}
