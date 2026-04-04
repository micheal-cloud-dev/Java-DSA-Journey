import java.util.HashMap;
public class TwoSome {

    public static void main(String[] args) {
        
        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int complement = target-arr[i];            // number needed

            // check if complement exists
            if(map.containsKey(complement)){
                System.out.println("pair: "+complement +" and " +arr[i] );
                return;
            }
            // Store current elm
            map.put(arr[i],i);
          }
          System.out.println("No pair found");
    }
}
