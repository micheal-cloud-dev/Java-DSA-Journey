public class String_HashFunction {
    static int hashFunction(String key,int size){
        int sum = 0;
        
        for(int i=0; i<key.length();i++){
            sum += key.charAt(i);
        }
        return sum % size;
    }
    public static void main(String[] args) {
        int size = 10;

        System.out.println(hashFunction("ABC",size));
        System.out.println(hashFunction("XYZ",size));

    } 
}
