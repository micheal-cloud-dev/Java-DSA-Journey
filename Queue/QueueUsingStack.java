import java.util.*;
public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int data){
        stack1.push(data);
        System.out.print(data+" ");
    }

    void dequeue(){
        System.out.println("The dequeue data is:");
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        System.out.print(stack2.pop()+" ");
    }
    void peek(){
        System.out.println("The peek data is:");
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.peek());
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        
        System.out.println("The enqueue data are:");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println();
        q.dequeue();
        System.out.println();
        
        q.peek();
    }
    
}
