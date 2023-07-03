import java.util.*;
public class javabasics{
    // public static boolean appeartwice(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 return true;
    //             }
    //         }
    //     }return false;
    // }
    public static int qsn(int i,int n){
        int k=0;
         while (i <= n){
          i = i+2;
           n = n-3; 
           k++;
        }
        return k;
}
    
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println();
        System.out.print(qsn(60,300));
    }
}