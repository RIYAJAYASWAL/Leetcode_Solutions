class Solution {

    private void swap(int i,int j,int []arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private void f(int idx,List<List<Integer>> ans,int []nums){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int it:nums){
                temp.add(it);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            f(idx+1,ans,nums);
            swap(i,idx,nums);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        f(0,ans,nums);
        return ans;    
    }
}