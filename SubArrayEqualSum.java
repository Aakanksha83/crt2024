import java.util.*;
class SubArrayEqualSum
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        int sum=s.nextInt();
        int i,j,res;
        for(i=0;i<=n-k;i++){
         res=0;
        for(j=i;j<i+k;j++){
            res=res+a[j];
        }
                if(res==sum){
                    System.out.println("yes");
                    return;
                }
                
        }
            if(i==n-k+){
            System.out.println("no");
        }
        }

}


    
