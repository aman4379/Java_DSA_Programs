import java.util.*;
public class MonotonicArr {
    public static boolean isMonotonic(int[] nums) {
        if(nums[0]<=nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]>nums[i]){
                    return false;
                }
            }
        }
        else{
             for(int i=1;i<nums.length;i++){
                if(nums[i-1]<nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isMonotonic(arr));
    }
}
