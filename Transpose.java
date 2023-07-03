import java.util.*;
public class Transpose {
    public static int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=matrix[j][i];
            }
        } 
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans[][]= transpose(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }    
}