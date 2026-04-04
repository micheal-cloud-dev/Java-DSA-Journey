public class Basic_HashFunction {

    static int hashFuction(int key,int size){
        return key % size;
    }

    public static void main(String[] args) {
        
        int size = 10;

        int key1 = 101;
        int key2 = 202;

        int index_1 = hashFuction(key1,size);
        int index_2 = hashFuction(key2,size);

        System.out.println("Index of 101:"+index_1);
        System.out.println("Index of 202:"+index_2);
    }
}
