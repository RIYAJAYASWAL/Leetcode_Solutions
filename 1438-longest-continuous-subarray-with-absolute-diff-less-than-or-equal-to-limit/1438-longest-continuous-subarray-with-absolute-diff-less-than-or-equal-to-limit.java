class Solution {
    public int longestSubarray(int[] nums, int limit) {
       int n=nums.length;
       int count=0;
       int left=0;
       Deque <Integer> mindq=new ArrayDeque<>();
       Deque <Integer> maxdq=new ArrayDeque<>();

       for(int i=0;i<n;i++){
        while(!maxdq.isEmpty() && nums[maxdq.peekLast()]<nums[i]){
            maxdq.pollLast();
        }
        while(!mindq.isEmpty() && nums[mindq.peekLast()]>nums[i]){
            mindq.pollLast();
        }
        maxdq.offerLast(i);
        mindq.offerLast(i);

        while(nums[maxdq.peekFirst()]-nums[mindq.peekFirst()]>limit){

            if(maxdq.peekFirst()==left) {
                maxdq.pollFirst();
            }
            if(mindq.peekFirst() == left) {
                mindq.pollFirst();
            }
            left++;
        }
        count=Math.max(count,i-left+1);
        }
        return count;
    }
}