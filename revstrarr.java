import java.util.*;
public class revstrarr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder nstr= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            nstr.append(str.charAt(n-1-i));
        }
        nstr.toString();
        System.out.print(nstr);
        
    }
}