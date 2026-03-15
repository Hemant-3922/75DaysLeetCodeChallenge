class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int ar[]=new int[nums.length+1];
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
       
        for(int i=0;i<nums.length;i++){
            ar[nums[i]]++;

        }
        //find missing
        for(int i=1;i<ar.length;i++){
           if( ar[i]==0)list.add(i);
        }
        return list;
    }
}