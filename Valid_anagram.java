import java.util.*;
public class Valid_anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        String pvr = new String(arr);
        System.out.println(pvr);
    }
}