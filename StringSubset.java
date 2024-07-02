import java.util.*;
class  StringSubset{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        String str=s.nextLine();
        String str1=s.nextLine();
     
           if(str.contains(str1)){
        System.out.print("String is subset");
           }
           else{
               System.out.println("String is not subset");
           }
            
            
        }
}