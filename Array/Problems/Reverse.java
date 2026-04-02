class Reverse{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        System.out.println("The Reversel of an Array is:");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
