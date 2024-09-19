import java.util.HashMap;
import java.util.Map;
public class IterateHashMap{
   public static void main(String[] args){
     HashMap<Integer,String>map=new HashMap<>();
     map.put(11,"Apple");
     map.put(12,"Banana");
     map.put(13,"Cherry");
     System.out.print("Key:");
     for(Integer key:map.keySet()){
          System.out.print(key+" ");
     }
     System.out.println();
     System.out.print("Values:");
     for(String value:map.values()){
         System.out.print(value+" ");
     }
     System.out.println();
     System.out.println("Key-value pairs:");
     for(Map.Entry<Integer,String>entry:map.entrySet()){
        System.out.println(entry.getKey()+"=>"+entry.getValue());
}
}
}
