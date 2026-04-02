class PrefixSum{
    public static void main(String[] args){
        int[] arr ={2,4,6,8};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        System.out.println("Prefix Sum is:");

        System.out.print(prefix[0]+" ");
        for(int i=1; i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
             System.out.print(prefix[i]+" ");
        }
       
    }

}
