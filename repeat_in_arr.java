import java.util.*;
public class repeat_in_arr{
    public static boolean repeat(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(repeat(arr,n)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}