import java.util.HashSet;
public class Longest_Consecutive_Sequence {

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        HashSet<Integer> set = new HashSet<>();

        // Add all elm to set
        for(int num : arr){
            set.add(num);
        }
        int longest = 0;

        for(int num : set){
            if( ! set.contains(num-1)){
                int current = num;
                int count = 1;
                // Count consecutive number
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                // Update longest
                longest = Math.max(longest,count);
            }
        }
        System.out.println("Longest Sequence Length:"+longest);
    }
}
