public class LinearSearch{
    public static int linearSearch(int[] num, int target){
        for(int i=0; i<num.length;i++){
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num ={24,68,84,61};
        int target = 61;
        int result = linearSearch(num,target);

        if(result != -1){
            System.out.println("The index is:"+result);
        }
        else{
            System.out.println("target not found");
        }
    }
}
