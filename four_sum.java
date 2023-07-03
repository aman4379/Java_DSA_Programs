import java.util.*;
public class four_sum{
     public static void fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        long sum=0;
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i>0&& nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&& nums[j]==nums[j-1]){
                    continue;
                }
                int st=j+1,en=nums.length-1;
                while(st<en){
                    sum =(long)nums[i]+nums[j]+nums[st]+nums[en];
                    if(sum<target){
                        st++;
                    }
                    else if(sum>target){
                        en--;
                    }
                    else{
                        l.add(Arrays.asList(nums[i],nums[j],nums[st],nums[en]));
                        while(st<en && nums[st]==nums[st+1]){
                            st++;
                        }
                        while(st<en && nums[en]==nums[en-1]){
                            en--;
                        }
                        st++;
                        en--;
                    }
                }
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.print("[");
            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+",");
            }
            System.out.print("],");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        fourSum(arr,target);
    }
}