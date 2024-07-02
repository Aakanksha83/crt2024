import java.util.*;
class StringAlpha {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char ch=s.next().charAt(0);
if(Character.isLetterOrDigit(ch)){

        System.out.println("Alpha numeric");
if(Character.isLetter(ch)){

         System.out.println("Alphabet");
if(Character.isUpperCase(ch)){
    System.out.println("Upper case");
}
else{
    System.out.println("Lower Case");
}
    }
    else{
        System.out.println("Digit");
    }
}
else{
    System.out.println("Special Symbol");
}
}
}