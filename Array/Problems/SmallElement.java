class SmallElement{
    public static void main(String[] args){
        int[] arr = {95,10,70,90,20,15};
        int min = arr[0];
        for(int i=1;i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The smallest value is");
        System.out.println(min);
    }
}
