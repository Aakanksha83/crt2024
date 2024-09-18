import java.util.*;
class VectorColl {
    public static void main(String[] args) {
        int i;
        Vector<Integer> v1=new Vector<>();
        System.out.println(v1.capacity());
        for(i=1;i<=20;i++)
             v1.add(i);
            System.out.println(v1);
        System.out.println(v1.capacity());
        v1.add(88);
           System.out.println(v1);
       System.out.println(v1.capacity());
       System.out.println(v1.size());
       
    }
}