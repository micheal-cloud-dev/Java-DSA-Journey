class QueueArray{
    int size = 4;
    int front = 0;
    int rear = -1;
    int[] arr = new int[size];

    void enqueue(int data){
        if(rear == size-1){                       // check if Queue is full
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
        System.out.print(arr[rear]+" ");
    }
    void dequeue(){
        if(rear<front){                           // Check if Queue is Empty
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[front]);
        front++;

        if(rear<front){
            front=0;
            rear=-1;
        }
    }
    void peek(){
        if(rear<front){                            // Check if Queue is Empty
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The Peak data is:");
        System.out.println(arr[front]);
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        System.out.println("The data enqueue are:");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println();
        System.out.println("The dequeue data is:");
        q.dequeue();
        q.peek();
    }
}
