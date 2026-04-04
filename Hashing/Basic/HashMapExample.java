import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Micheal");
        map.put(102,"Edison");
        map.put(103,"Mike");

        System.out.println("Value of 102: "+map.get(102));

        if(map.containsKey(103)){
            System.out.println("key 103 exists");
        }

        if(map.containsValue("Micheal")){
            System.out.println("Value Micheal exists");
        }
        map.remove(103);

        for(Integer Key : map.keySet()){
        System.out.println("Key: "+Key+" Value:" + map.get(Key));
        }
    }
}
