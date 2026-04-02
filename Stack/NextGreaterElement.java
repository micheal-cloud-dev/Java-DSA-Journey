import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,6,1,24};
        int n = arr.length;
        int[] result = new int[n];                    //array to store the ans
        Stack<Integer> stack=new Stack<>();           //Stack to keep elements
    
        for(int i=n-1; i>=0; i--){                    //traverse to R to L
           while(!stack.isEmpty() && stack.peek() <= arr[i]){  
            stack.pop();                             //remove<=element from Stack
           }
           if(stack.isEmpty()){
            result[i] = -1;                          // no greater element
           }
           else{
            result[i] = stack.peek();                //top is next greater element
           }
           stack.push(arr[i]);                      //push current elmt into Stack
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"-->"+result[i]);
        }
        
    }
    
}
