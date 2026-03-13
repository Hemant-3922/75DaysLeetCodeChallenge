class Solution {
    public int minCost(int n, int[] cuts) {
     List<Integer> list = new ArrayList<>();

        for(int c : cuts) list.add(c);

        list.add(0);
        list.add(n);

        Collections.sort(list);
        int dp[][]=new int[cuts.length+2][cuts.length+2];

        return solve(1, list.size()-2, list,dp);
    }
    public int solve(int l,int r,List<Integer> list,int[][] dp){
        if(l>r)return 0;
if(dp[l][r]!=0)return dp[l][r];
        int min=Integer.MAX_VALUE;

        for(int i=l;i<=r;i++){
            int cost=(list.get(r+1)-list.get(l-1))+
                            solve(l,i-1,list,dp)+solve(i+1,r,list,dp);
             min=Math.min(cost,min);
        }
        
        return dp[l][r]=min;
    }
}