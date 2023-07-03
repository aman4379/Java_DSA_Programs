import java.util.*;
public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();
        int next = lower;
        for (int i = 0; i < nums.length; i++) {
            // 1. We don't need to add [Integer.MAX_VALUE, ...] to result
            if(lower == Integer.MAX_VALUE) return res;
            if (nums[i] < next) {
                continue;
            }
            if (nums[i] == next) {
                next++;
                continue;
            }
            res.add(getRange(next, nums[i] - 1));
            // 2. We don't need to proceed after we have process Integer.MAX_VALUE in array
            if(nums[i] == Integer.MAX_VALUE) return res;
            next = nums[i] + 1;
        }
        
        if (next <= upper) {
            res.add(getRange(next, upper));
        }
        return res;
    }
    public static String getRange(int n1, int n2) {
        return n1 == n2 ? String.valueOf(n1) : String.format("%d->%d" , n1, n2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        List<String> list = findMissingRanges(arr,lower,upper);
        for(String str:list){
            System.out.print(str + ",");
        }
    }
}
