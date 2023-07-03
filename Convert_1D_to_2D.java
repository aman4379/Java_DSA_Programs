import java.util.*;
public class Convert_1D_to_2D {
     public static int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][] = new int[m][n];
        if((m*n)>original.length || (m*n)<original.length){
            int an[][] = new int[0][0];
            return an;
        }
        else{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    ans[i][j]= original[i*n+j];
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ans[][] = construct2DArray(arr,m,n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
