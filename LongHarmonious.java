import java.util.*;
public class LongHarmonious {
     public static int findLHS(int[] nums) {
       Arrays.sort(nums);
       int left=0,right=1,result=0;
       while(right<nums.length){
           int diff=nums[right]-nums[left];
           if(diff==1) {
               result=Math.max(result,right-left+1);
           }
           if(diff<=1){
               right++;
           }
           else{
               left++;
           }
       }
       return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res = findLHS(arr);
        System.out.println(res);
    }    
}
