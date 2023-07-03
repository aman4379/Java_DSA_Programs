import java.util.*;
public class Arr_partition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum =0,i=0;
        while(i<nums.length-1){
            sum+=nums[i];
            i+=2;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayPairSum(arr));
    }
}
