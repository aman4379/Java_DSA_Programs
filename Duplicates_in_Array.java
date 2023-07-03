import java.util.*;
public class Duplicates_in_Array {
      public static List<Integer> findDuplicates(int[] nums) {
         int n = nums.length;
        int arr[] = new int[n+1];
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[nums[i]] += 1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ll = findDuplicates(arr);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+",");
        }
    }
}