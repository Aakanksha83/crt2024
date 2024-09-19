import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class RemoveEntries{
     public static void main(String args[]){
          HashMap<Integer,String>map=new HashMap<>();
          map.put(1,"Apple");
          map.put(2,"Banana");
          map.put(3,"Cherry");
          map.put(4,"Date");
          Iterator<Map.Entry<Integer,String>>iterator=map.entrySet().iterator();
          while(iterator.hasNext()){
          Map.Entry<Integer,String>entry=iterator.next();
          if(entry.getKey()%2==0){
                     iterator.remove();
              }
          }
          System.out.println("Map after removing entries with even keys:"+map);
}
} 