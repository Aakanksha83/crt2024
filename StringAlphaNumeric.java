import java.util.*;
class StringAlphaNumeric {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        int alp=0,u=0,l=0,d=0,sy=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
        
if(Character.isLetter(c)){
    alp++;
    if(Character.isUpperCase(c)){
        u++;
        
    }
    else{
        l++;
    }
}
    else if(Character.isDigit(c)){
    d++;
    }
    else
    sy++;
}
        System.out.println("Alphabet="+alp);
         System.out.println("UpperCase="+u);

 System.out.println("LowerCase="+l);

 System.out.println("Digit="+d);
 System.out.println("Special Symbols="+sy);
}
}


