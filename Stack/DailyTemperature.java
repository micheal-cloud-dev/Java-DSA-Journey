import java.util.*;
public class DailyTemperature{
    public static int[] dailyTemperature(int[] temp){
        int n = temp.length;
        int[] result = new int[n];                   //result array to store the ans

        Stack<Integer> stack= new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int preIndex = stack.pop();          // get index from stack
                result[preIndex] = i-preIndex;       // calculate no.of days waited
            }
            stack.push(i);                             //push current index into stack
        }
            return result;
    }
    public static void main(String[] args){
            int[] temperature = {73,69,75,60,76,83,72};

            int[] ans = dailyTemperature(temperature);

            for(int i:ans){
                System.out.println(i+ " ");
            }
    }
}
