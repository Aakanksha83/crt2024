import java.util.*; 
class Prime2{
public static void main(String args[]){
int n,i,c=0,r=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n==1){
c=1;
}
else{
for(i=1;i<=Math.sqrt(n);i++){
r++;
if(n%i==0)
{
c++;
break;
}
}
}
System.out.println(r);
if(c==2){
System.out.println("Prime no");
}
else{
System.out.println("not a prime");
}
}
}

