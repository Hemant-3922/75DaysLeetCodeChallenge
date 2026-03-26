class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       }
        int max=sum;
       int i=0;
       int j=k;
        while(j<nums.length){
            sum+=nums[j];
            sum-=nums[i];
            i++;j++;

            max=Math.max(max,sum);
        }
        double ans=(double)max/k;
        return ans;
    }
}