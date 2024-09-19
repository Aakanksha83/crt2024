import java.util.HashMap;
public class BasicHashMapOperations{
      public static void main(String args[]){
       HashMap<Integer,String> map=new HashMap<>();
       map.put(1,"Apple");
       map.put(2,"Banana");
       map.put(3,"Cherry");
       System.out.println("Initial map:"+map);
       System.out.println("Value for key2:"+map.get(2));
       map.remove(2);
       System.out.println("Map contains key 1:"+map.containsKey(1));
       System.out.println("Map contains key 2:"+map.containsKey(2));
       System.out.println("Map contins value 'Apple':"+map.containsValue("Apple"));
       System.out.println("Map contins value 'Dragon':"+map.containsValue("Dragon"));
        System.out.println("Map contins value 'Cherry':"+map.containsValue("Cherry"));
        System.out.println("Map contins value 'Banana':"+map.containsValue("Banana"));
        System.out.println("Is map empty?"+map.isEmpty());
        System.out.println("Size of map:"+map.size());
       }
}