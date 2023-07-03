import java.util.*;
public class Container_with_most_water{
    // public static int mostwater(int arr[],int n){      //   O(n^2)
    //     int st=0,en=n-1,sum=0;
    //     int mx=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             sum=(j-i)*Math.min(arr[i],arr[j]);
    //             if(mx<sum){
    //                 mx=sum;
    //                 st=i;
    //                 en=j;
    //             }
    //         }
    //     }
    //     System.out.println(st+","+en);
    //     return mx;
    // }

    public static int storewater(int arr[],int n){
        int st=0,en=n-1,sum=0;
        int mx=Integer.MIN_VALUE;
        while(st<en){
            sum=(en-st)*Math.min(arr[st],arr[en]);
            mx=Math.max(mx,sum);
            if(arr[st]<arr[en]){
                st++;
            }
            else{
                en--;
            }
        }
        return mx;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(storewater(arr,n));
    }
}