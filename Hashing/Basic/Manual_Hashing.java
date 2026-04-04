public class Manual_Hashing {

    static int size = 10;
    static int[] hashTable = new int[size];

    // Hash Function

    static int hashFunction(int key){
        return key % size;
    }

    // Insert

    static void insert(int key){
        int index = hashFunction(key);
        hashTable[index] = key;
    }

    // Search

    static boolean search(int key){
        int index = hashFunction(key);
        return hashTable[index] == key;
    }
public static void main(String[] args) {
    insert(10);
    insert(20);
    insert(30);

    System.out.println(search(20));
    System.out.println(search(25));
 }    
}
