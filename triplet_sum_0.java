import java.util.*;
public class triplet_sum_0{
    public static int center(int arr[],int n){
        int st=0,en=n-1;
        int mid=0;
        while(st<en){
            mid=(st+en)/2;
            if(arr[mid]<0 & (arr[mid]==0||arr[mid]>0)){
                return mid;
            }
            else if(arr[mid]>0){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        if(n>=3){
        System.out.println(center(arr,n));
        }
    }
}