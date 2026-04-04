import java.util.ArrayList;

public class Collision_Handling {
    int size;
    ArrayList<Integer>[] table;

    @SuppressWarnings("unchecked")
    Collision_Handling(int size){
        this.size=size;
        table = (ArrayList<Integer>[])new ArrayList[size];

        // Initialize

        for(int i=0; i<size; i++){
            table[i] = new ArrayList<>();
        }
    }
        // Hash function

        int hashFuction(int key){
            return key % size;
        }

        // Insert

        void insert(int key){
            int index = hashFuction(key);
            table[index].add(key);
        }

        // Disply

        void disply(){
            for(int i=0; i<size; i++){
                System.out.print(i+"-->");
            
            for(int value : table[i]){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {

    Collision_Handling obj = new Collision_Handling(5);

    obj.insert(10);
    obj.insert(15);
    obj.insert(20);
    obj.insert(7);

    obj.disply();
    
}
    
}
