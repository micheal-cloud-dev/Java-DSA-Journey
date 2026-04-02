import java.util.*;
public class StockSpan{
    public static void calculatespan(int[] prize,int[] span){
       Stack<Integer> stack = new Stack<>();
       stack.push(0);                  //push first index(day 0)
       span[0]=1;                           //span for 1st day always 1
       for(int i=0;i<prize.length;i++){
        while(!stack.isEmpty()&&prize[i]>=prize[stack.peek()]){
            stack.pop();                     //remove small element
        }
        if(stack.isEmpty()){
            span[i]=i+1;
        }
        else{
            span[i]=i-stack.peek();
        }
        stack.push(i);
       }
    }
    public static void main(String[] args) {
        int[] prize = {100,90,80,70,60,50};
        int n = prize.length;
        int[] span = new int[n];

        calculatespan(prize,span);

        System.out.println("Stock Span Value:");
        for(int s:span){
            System.out.println(s+" ");
        }
    }
} 
