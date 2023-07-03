import java.util.*;
public class Plus_one{
    public static int[] plus(int arr[]){
        int i = arr.length-1;
        while(i>=0){
            if(arr[i]!=9){
                arr[i]+=1;
                return arr;
            }
            else{
                arr[i]=0;
                if((i-1)<0){
                    int new_arr[] = new int[arr.length+1];
                    for(int k=arr.length-1;k>=0;k--){
                        new_arr[k+1]=arr[k];
                    }
                    new_arr[0]=1;
                    return new_arr;
                }
            }
            i--;
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = plus(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }
}