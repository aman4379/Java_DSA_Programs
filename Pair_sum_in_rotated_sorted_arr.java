import java.util.*;
public class Pair_sum_in_rotated_sorted_arr{
    public static int min_ele_sort_arr(int nums[]){
        int st=0,en=nums.length-1;
        int ans=-1,mid=-1;
        if(nums.length==1){
            return 0;
        }
        if(nums[st]<nums[en]){
            return 0;
        }
        while(st<en){
           mid=(st+en)/2;
           if(nums[mid]>nums[mid+1]){
               return mid+1;
           }
           if(nums[mid-1]>nums[mid]){
               return mid;
           }
            if(nums[mid]>nums[0]){
                    st=mid+1;
            }
                else{
                    en=mid-1;
                }
        }
        return mid;
    }
    public static int[] sort_arr(int arr[],int n,int pivot){
        int narr[]= new int[n];
        for(int i=0;i<n;i++){
            int k=(i+2)%n;
            narr[i]=arr[k];
            System.out.print(narr[i]+" ");
        }
        return narr;
    }
    public static void pair_sum(int arr[],int n,int k){
        int st=0,en=n-1,sum=0;
        int pair[]=new int[2];
        while(st<en){
            sum=arr[st]+arr[en];
            if(sum==k){
                pair[0]=arr[st];
                pair[1]=arr[en];
            }
            if(sum>k){
                en--;
            }
            else{
                st++;
            }
        }
        System.out.println("("+pair[0]+","+pair[1]+")");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int pivot =min_ele_sort_arr(arr);
        int[] new_arr=sort_arr(arr,n,pivot);
        pair_sum(new_arr,n,k);
    }
}