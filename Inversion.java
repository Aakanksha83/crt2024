import java.io.*;
import java.util.*;
class Inversion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int c=0;
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
    if(a[i]<a[j]){
    
       c=c+1;
            }
        }

}
            System.out.print(c);
        
}
    }