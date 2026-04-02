public class CircularQueue {
    int size = 3;
    int front = 0;
    int rear = -1;
    int[] arr=new int[size];

    void enqueue(int data){
         if((rear+1)%size == front&&rear!= -1){   // check full condition
            System.out.println("Queue is Full");
            return;
         }
         rear = (rear+1)%size;                    //Move rear circularly
         arr[rear] = data;                        //insert element
         System.out.print(data+" ");
        }
    void dequeue(){
        if(rear==-1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[front]);
        // if only one element
        if(front==rear){                         
            front = 0;                             //reset front
            rear = -1;                             //mark empty
        }
        // Move front circularly
        else{                                       
            front=(front+1)%size;
        }
    }
    void peek(){
        if(rear==-1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print(arr[rear]+" ");
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        System.out.println("The enqueue data are:");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println();
        System.out.println("The dequeue data is:");
        q.dequeue();
        System.out.println("The peek data is:");
        q.peek();
        
    }
    
}
