import java.util.HashMap;

public class Built_in_Hashing {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer,String> map = new HashMap<>();

        // Insert
        map.put(101,"Micheal");
        map.put(102,"Edison");
        map.put(103,"Micheal Edison");

        //Retrieve

        System.out.println("ID 103:"+" "+map.get(103));

        // Check if Key exists

        if(map.containsKey(102))
            System.out.println("Key 102 Exists");
        else
            System.out.println("Key 102 Not Exists");

        // Delete

        map.remove(102);

        // Disply all data

        System.out.println("All Elements:"+map);
    }
}
