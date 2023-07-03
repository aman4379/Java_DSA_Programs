import java.util.*;
public class chocolate_distribution{
    public static void cho_dstr(int arr[],int n,int m){
        int start=0,end=0;
        int diff,ms=Integer.MAX_VALUE;
        for(int i=0;(i+m-1)<n;i++){
            diff=arr[i+m-1]-arr[i];
            if(ms>diff){
                    ms=diff;
                    start=i;
                    end=i+m-1;
                }
        }
        System.out.println("Minimum Difference is: "+ms);
        System.out.println("start="+start+" end="+end);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        Arrays.sort(arr);
        cho_dstr(arr,n,m);
    }
}