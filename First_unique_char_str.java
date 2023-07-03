import java.util.*;
public class First_unique_char_str{
    public static int firstUniqChar(String s) {
      int min = Integer.MAX_VALUE;
        for(int i= 'a';i<= 'z';i++){
            int idx = s.indexOf(i);
            if(idx != -1 && s.lastIndexOf(i) == idx){
                min = Math.min(min,idx);
            }
        }
        return min !=Integer.MAX_VALUE ? min : -1 ;  
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans=firstUniqChar(str);
        System.out.println(ans);
    }
}