import java.util.*;
public class small_rotated_sort{
    public static int min_ele_sort_arr(int nums[]){
        int st=0,en=nums.length-1;
        int ans=-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[st]<nums[en]){
            return nums[0];
        }
        while(st<en){
           int mid=(st+en)/2;
           if(nums[mid]>nums[mid+1]){
               return nums[mid+1];
           }
           if(nums[mid-1]>nums[mid]){
               return nums[mid];
           }
            if(nums[mid]>nums[0]){
                    st=mid+1;
            }
                else{
                    en=mid-1;
                }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(min_ele_sort_arr(arr));
    }
}