import java.util.*;
public class ShuffleArr {
    public static int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int i=0;
        while(i<n){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
            i++;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[2*n];;
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=shuffle(arr,n);
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+",");
        }
    }
}
