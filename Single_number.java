import java.util.*;
public class Single_number{
    // public static int singleNumber(int nums[]) {
    //     int result=0;
    //     int n=nums.length;
    //     HashMap<Integer,Integer> hm = new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         if(hm.containsKey(nums[i])){
    //             hm.put(nums[i],hm.get(nums[i])+1);
    //         }
    //         else{
    //             hm.put(nums[i],1);
    //         }
    //     }
    //     for(Map.Entry<Integer,Integer> ll :hm.entrySet()){
    //         if(ll.getValue()==1){
    //             result=ll.getKey();
    //             break;
    //         }
    //     }
    //     return result;
    // }
    public static int singleNumber(int nums[]){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = singleNumber(arr);
        System.out.print(ans);
    }
}