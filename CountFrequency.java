import java.util.HashMap;
import java.util.Map;
public class CountFrequency{
     public static void main(String[] args){
     String[] words={"apple","banana","apple","cherry","banana","banana"};
    HashMap<String,Integer>frequencyMap=new HashMap<>();
    for(String word:words){
        frequencyMap.put(word,frequencyMap.getOrDefault(word,0)+1);
   }
   System.out.println("Frequency of elements:");
   for(Map.Entry<String,Integer>entry:frequencyMap.entrySet()){
   System.out.println(entry.getKey()+":"+entry.getValue());
}
}
}