class Solution {
    public int lengthOfLongestSubstring(String s) {
    //   Map<Character,Integer> map=new HashMap<>();
    Set<Character> set=new HashSet<>();
      int l=0;
      int n=s.length();
      int maxLen=0;
      for(int i=0;i<n;i++){
    //  if(map.containsKey(s.charAt(i))){
    //    l = Math.max(l, map.get(s.charAt(i)) + 1);
    //  }
    while(set.contains(s.charAt(i))){
        set.remove(s.charAt(l));
        l++;
    }
     set.add(s.charAt(i));
        maxLen=Math.max(maxLen,i-l+1);    
      }
      return maxLen;
    }
}