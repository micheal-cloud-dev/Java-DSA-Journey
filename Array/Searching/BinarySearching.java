public class BinarySearch{
    public static int binarySearch(int[] num,int target){
        int left = 0;
        int right = num.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(num[mid] == target){
                return mid;
            }
            else if(num[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {20,30,10,50,70};
        int target = 10;
        int result = binarySearch(num,target);
        if(result != -1){
            System.out.println("The index is:"+result);
        }
        else{
            System.out.println("Target not found");
        }
    }
}
