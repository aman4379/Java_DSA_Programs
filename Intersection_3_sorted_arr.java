import java.util.*;
public class Intersection_3_sorted_arr {
    public static List<Integer> intersect(int[] arr1,int[] arr2,int[] arr3){
         List<Integer> intersection = new ArrayList<Integer>();
        int length1 = arr1.length, length2 = arr2.length, length3 = arr3.length;
        int index1 = 0, index2 = 0, index3 = 0;
        while (index1 < length1 && index2 < length2 && index3 < length3) {
            int num1 = arr1[index1], num2 = arr2[index2], num3 = arr3[index3];
            if (num1 == num2 && num1 == num3) {
                intersection.add(num1);
                index1++;
                index2++;
                index3++;
            } else {
                int increment1 = 0, increment2 = 0, increment3 = 0;
                if (num1 < num2 || num1 < num3)
                    increment1 = 1;
                if (num2 < num1 || num2 < num3)
                    increment2 = 1;
                if (num3 < num1 || num3 < num2)
                    increment3 = 1;
                index1 += increment1;
                index2 += increment2;
                index3 += increment3;
            }
        }
        return intersection;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=sc.nextInt();
        int o = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        int arr3[] = new int[o];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<o;i++){
            arr3[i]=sc.nextInt();
        }
        List<Integer> al = new ArrayList<Integer>();
        al= intersect(arr1,arr2,arr3);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+",");
        }
    }
}