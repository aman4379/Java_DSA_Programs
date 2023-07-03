import java.util.*;
public class Product3num {
      public static int maximumProduct(int[] nums) {
        int n=nums.length-1;
        int res1=0,res2=0;
        Arrays.sort(nums);
        res1=nums[0]*nums[1]*nums[n];
        res2=nums[n]*nums[n-1]*nums[n-2];
        return Math.max(res1,res2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maximumProduct(arr));
    }
}
