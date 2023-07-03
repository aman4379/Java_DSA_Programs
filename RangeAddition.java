import java.util.*;
public class RangeAddition {
    public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0){
            return m*n;
        }
        int l=ops.length;
        for(int i=0;i<l;i++){
            int k=ops[i][0],p=ops[i][1];
            m=Math.min(m,k);
            n=Math.min(n,p);
        }
        return m*n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int s=sc.nextInt();
        int arr[][]=new int[s][2];
        for(int i=0;i<s;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        System.out.println(maxCount(m,n,arr));
    }
}
