import java.util.*;
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int st=0,end =nums.length-1,mid=0;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
}
