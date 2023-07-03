import java.util.*;
public class kth_largest{
    public static int k_large(int arr[],int n,int k){
        Arrays.sort(arr);
        return arr[n-k];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(k_large(arr,n,k));
    }
}