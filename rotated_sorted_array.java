import java.util.*;
public class rotated_sorted_array{
    public static int target_search(int arr[],int n,int t){
        int start=0,end=n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==t){
                return mid;
            }
            if(arr[start]<=arr[mid]){            //left sorted;
                if(t>arr[mid] || t<arr[start]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
                }
            else{                                  //right sorted;
                if(t<arr[mid] || t>arr[end]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            }
            return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("target is at point"+target_search(arr,n,target));
    }
}