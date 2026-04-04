import java.util.HashMap;
public class SubArray_with_given_sum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 12;

        HashMap<Integer,Integer> map = new HashMap<>();
 
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];               // prefix sum

            // Case 1: direct match
            if( sum == target){
               System.out.println("Subarray found from 0 to"+ i );
               return;
            }
            // Case 2: check if (sum - target) exists
            if(map.containsKey(sum-target)){
                System.out.println("Subarray found from  "+(map.get(sum-target)+1) +" to "+i);
                return;
            }
            // Store prefix sum
            map.put(sum,i);
        }
        System.out.println("No Subarray found");
    }
}
