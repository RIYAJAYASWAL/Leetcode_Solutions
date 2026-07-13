class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
        int[] ans=new int[k];
        int count=0;
        double median=0;
        
        for(int i=0;i<n;i++){
            ans[i]=nums1[i];
            count++;
        }
        for(int i=0;i<m;i++){
            ans[count]=nums2[i];
            count++;
        }
        Arrays.sort(ans);

       
        if(k%2==0){
            median=(ans[k/2]+ans[(k/2)-1])/2.0;
        }else{
            median=ans[k/2];
        }
        return median;
    }
}