import java.util.*;
public class next_permutation{
public static void swap(int arr[],int st,int en){
    int temp = arr[st];
    arr[st] = arr[en];
    arr[en] = temp;
}
public static void reverse(int arr[],int st,int en){
    while(st<en){
        swap(arr,st,en);
        st++;
        en--;
    }
}
public static void permutation(int arr[]){
    int st1=-1,st2=-1;
    for(int i=arr.length-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            st1=i;
            break;
        }
    }
    if(st1==-1){
            reverse(arr,0,arr.length-1);
        }
    else{
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[st1]){
                st2=i;
                break;
            }
        }
    }
    swap(arr,st1,st2);
    reverse(arr,st1+1,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        permutation(arr);
    }
}