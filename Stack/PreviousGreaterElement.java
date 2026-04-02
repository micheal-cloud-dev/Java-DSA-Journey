import java.util.*;
public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10};
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<=n-1;i++){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"-->"+result[i]);
        }
    }   
}
