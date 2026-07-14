class Solution {
    public int count(String date){
        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3));
        int total=day;

        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    } 
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int A_A=count(arriveAlice);
        int A_L=count(leaveAlice);
        int B_A=count(arriveBob);
        int B_L=count(leaveBob);

        int start=Math.max(A_A,B_A);
        int end=Math.min(A_L,B_L);

        return Math.max(0,end-start+1);
    }
}