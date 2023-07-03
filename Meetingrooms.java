import java.util.*;
public class Meetingrooms{
      public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0, n = intervals.length; i < n - 1; ++i) {
            if (intervals[i][1] > intervals[i + 1][0]) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int meeting[][] = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                meeting[i][j]= sc.nextInt();
            }
        }
        System.out.print(canAttendMeetings(meeting));
    }
}
