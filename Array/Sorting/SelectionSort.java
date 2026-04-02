public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {20,50,30,10,15};
        int size = arr.length;

        System.out.println("Before Sorting the Array");
        for(int num : arr){
            System.out.print(num+ " ");
        }

        for(int i=0;i<size-1;i++){
            int minIndex = i;
            for(int j=i+1;j<size;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("After Sorting the Array");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
