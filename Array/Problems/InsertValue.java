public class InsertValue{
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int size = 4;
        int position = 2;
        int value = 25;
        
        for(int i = size; i> position;i--){
            arr[i] = arr[i-1];
        }
        arr[position] = value;
        size++;
        
        for(int i =0; i < size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
