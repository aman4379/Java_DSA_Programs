import java.util.*;
public class maxmin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<=(n/2);i++){
            int j=n-1-i;
            if(arr[i]>=arr[j]){
                if(arr[i]>=mx){
                    mx=arr[i];
                }
                if(arr[j]<=mn){
                    mn=arr[j];
                }
            }
            else{
                if(arr[j]>=mx){
                    mx=arr[j];
                }
                if(arr[i]<=mn){
                    mn=arr[i];
                }
            }
        }
        int sum = mx+mn;
        System.out.println("maximun element = "+ mx);
        System.out.println("minimum element = "+ mn);
        System.out.println("Sum = "+ sum);
    }
}