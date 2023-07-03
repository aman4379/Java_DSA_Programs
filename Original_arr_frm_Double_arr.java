import java.util.*;
public class Original_arr_frm_Double_arr {
    public static int[] findOriginalArray(int changed[]) {
        if(changed.length%2==1){
            return new int[0];
        }
        int ans[] = new int[changed.length/2];
        int count[] = new int[100001];
        for(int i:changed){
            count[i]++;
        }
        int idx=0;
        for(int i=0;i<100001;i++){
            while(count[i]>0 && (i*2)<100001 && count[i*2]>0){
                count[i]--;
                count[i*2]--;
                ans[idx]=i;
                idx++;
            }
        }
        for(int i=0;i<100001;i++){
            if(count[i]>0){
                return new int[0];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = findOriginalArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }
}
