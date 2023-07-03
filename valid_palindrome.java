import java.util.*;
public class Valid_palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder("");
        int n=str.length();
        for(int i=0;i<str.length();i++){
            char ch= Character.toLowerCase(str.charAt(i));
            int a = ch;
            if(((a>96) && (a<123)) ||((a>47) && (a<58))){
             str1.append(ch);
            }
        }
        int k=0;
        System.out.println(str1.length());
        for(int i=0;i<(str1.length()/2);i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-1-i)){
                k=1;
            }
        }
        if(k==0){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        System.out.println(str1);
    }
}