import java.util.*;
public class max_prod_arr{
    public static int prod(int arr[],int n){
        int ans=arr[0];
        int maxp=arr[0];
        int minp=arr[0];
        int temp;
        for(int i=1;i<n;i++){
        temp=Math.max(arr[i],Math.max(maxp*arr[i],minp*arr[i]));
        minp=Math.min(arr[i],Math.min(maxp*arr[i],minp*arr[i]));
        maxp=temp;
        ans=Math.max(maxp,ans);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(prod(arr,n));
    }
}