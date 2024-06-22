import java.util.*; 
class Prime{
public static void main(String args[]){
int n,i,c=0,r=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++){
r++;
if(n%i==0)
{
c++;
}
}
if(c==2){
System.out.println("Prime no");
}
else{
System.out.println("not a prime");
}
}
}

