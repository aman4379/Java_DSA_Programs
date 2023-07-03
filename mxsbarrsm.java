import java.util.*;
public class mxsbarrsm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cs=0,ms=Integer.MIN_VALUE,j=0;
        while(j<arr.length){
            
            if(cs<0 && arr[j]>0){
                cs=0;
            }
            cs+=arr[j];
            ms=Math.max(cs,ms);
            j++;
        }
        System.out.println("max sum arr="+ ms);
}
}