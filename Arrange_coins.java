import java.util.*;
public class Arrange_coins {
    public static int arrangeCoins(int n) {
       long st=1;
       long en=n;
       long ans=-1;
       while(st<=en){
           long mid =st+(en-st)/2;
           if((mid*(mid+1))/2<=n){
               ans=mid;
               st=mid+1;
           }
           else{
               en=mid-1;
           }
       }
       return (int)ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
}
