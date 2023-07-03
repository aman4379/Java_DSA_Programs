import java.util.*;
public class product_of_array_exc_self{
    public static int[] product(int arr[],int n){       //division method(but not handling arr[k]=0 value)
        int prd=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            prd=prd*arr[i];
        }
        for(int i=0;i<n;i++){
        ans[i]=prd/arr[i];
        }
        return ans;
    }

    // public static int[] product(int arr[],int n){
    //     int prefix[] = new int[n];
    //     int suffix[] = new int[n];
    //     int ans[]= new int[n];
    //     prefix[0]=1;
    //     suffix[n-1]=1;
    //     for(int i=1;i<n;i++){
    //         prefix[i]=prefix[i-1]*arr[i-1];
    //     }
    //     for(int i=n-2;i>=0;i--){
    //         suffix[i]=suffix[i+1]*arr[i+1];
    //     }
    //     for(int i=0;i<n;i++){
    //         ans[i]=prefix[i]*suffix[i];
    //     }
    //     return ans;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        int[] prud=product(arr,n);
        for(int i=0;i<n;i++){
        System.out.print(prud[i]+",");
        }
    }
}