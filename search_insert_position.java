import java.util.*;
public class search_insert_position{
    public static int position(int arr[],int target){
        int st=0,end=arr.length-1;
        int ans=arr.length;
        while(st<end){
            int mid= st +(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }
            else{
                ans = mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int pos = position(arr,target);
        System.out.println(pos);
    }
}