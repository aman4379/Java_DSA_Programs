import java.util.*;
public class Three_sum_closest{
    public static int threeSumClosest(int nums[], int target) {
        Arrays.sort(nums);
        int a=-1,dif=-1,sum=0;
        int mn= Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                dif = Math.abs(target-sum);
                if(dif<mn){
                    a=nums[i]+nums[j]+nums[k];
                    mn=dif;
                }
                if(sum<=target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = threeSumClosest(arr,target);
        System.out.println(ans);
    }
}