import java.util.*;
public class Dist_btw_2_Arr {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        int k;
        for(int i=0;i<arr1.length;i++){
            k=1;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    j=arr2.length;
                    k=0;
                }
            }
            if(k==1){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int d = sc.nextInt();
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
}