import java.util.*;
public class Minscore {
    public static int minscore(int arr[],int k){
        Arrays.sort(arr);
        arr[0]=arr[0]+(k);
        arr[arr.length-1]=arr[arr.length-1]+(-k);
        return (arr[arr.length-1]-arr[0]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(minscore(arr,k));
    }
}
