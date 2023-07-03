import java.util.*;
public class Diff_2_Arr {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l= new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums2){
            set.add(n);
        }
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
                l1.add(nums1[i]);
                set.add(nums1[i]);
            }
        }
        set.clear();
        for(int n:nums1){
            set.add(n);
        }
        for(int n:nums2){
            if(!set.contains(n)){
                l2.add(n);
                set.add(n);
            }
        }
        l.add(l1);
        l.add(l2);
        return l;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        List<List<Integer>> l = findDifference(arr1,arr2);
        System.out.println(l);
    }
}
