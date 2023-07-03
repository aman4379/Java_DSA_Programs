import java.util.*;
public class trapping_rainwater{
    // public static int trap(int[] height,int n) {       // Time complexity=O(n^2)
    //     int sum=0;
    //     for(int i=1;i<height.length-1;i++){
    //         int lh=Integer.MIN_VALUE,rh=Integer.MIN_VALUE;
    //         for(int j=0;j<=i;j++){
    //             if(lh<height[j]){
    //                 lh=height[j];
    //             }
    //         }
    //         for(int j=i+1;j<height.length;j++){
    //             if(rh<height[j]){
    //                 rh=height[j];
    //             }
    //         }
    //         int w=0;
    //         w=Math.min(rh,lh)-height[i];
    //         if(w>0){
    //             sum+=w;
    //         }
    //         System.out.println("lh="+lh+" rh="+rh+" sum="+sum);
    //     }
    //     return sum;
    // }

     public static int trap(int[] height,int n) {        //Time Complexity=O(n)
        int sum=0;
        int ls[]=new int[n];
        ls[0]=height[0];
        for(int i=1;i<n;i++){
            ls[i]=Math.max(height[i],ls[i-1]);
        }
        int rs[]= new int[n];
        rs[n-1]=height[n-1];
        for(int i=n-2;i>0;i--){
            rs[i]=Math.max(height[i],rs[i+1]);
        }
        for(int i=0;i<n;i++){
            int w=0;
            w=Math.min(rs[i],ls[i])-height[i];
            if(w>0){
                sum+=w;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int trp=trap(arr,n);
        System.out.println(trp);
    }
}