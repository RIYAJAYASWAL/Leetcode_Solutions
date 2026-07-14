class Solution {
    public int time(String time){
        int h=Integer.parseInt(time.substring(0,2));
        int m=Integer.parseInt(time.substring(3));
        int total=h*60+m;
        return total;
    }
    public int convertTime(String current, String correct) {
        int total_cur=time(current);
        int total_cor=time(correct);
        int diff=total_cor-total_cur;
        int count=0;

        while(diff>0){
            if(diff>=60){
                diff-=60;
                count++;
            }else if(diff>=15){
                diff-=15;
                count++;
            }else if(diff>=5){
                diff-=5;
                count++;
            }else{
                diff--;
                count++;
            }
        }
        return count;
    }
}