import java.util.*;
public class buy_sell_stock{
    public static int profit(int arr[],int n){
        int mp=0,p,bp=0;
        for(int i=1;i<n;i++){
            if(arr[bp]<arr[i]){     //profit
            p=arr[i]-arr[bp];
            mp=Math.max(mp,p);
            }
            else{
                bp=i;
            }
        }
        return mp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Profit is "+profit(arr,n));
    }
}