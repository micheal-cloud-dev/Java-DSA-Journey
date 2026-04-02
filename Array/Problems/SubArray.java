class SubArray{
    public static void main(String[] args) {
        int[] arr = {10,15,20};
        int n = arr.length;

        for(int start=0; start<n; start++){
            for(int end =start; end<n;end++){
                for(int i = start; i<=end; i++){
                    System.out.println(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
