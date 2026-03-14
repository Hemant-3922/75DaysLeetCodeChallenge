class Solution {
    public boolean isAnagram(String s, String t) {
       int[] charFreq =new int[26];
       for (char ch : s.toCharArray()) {
        charFreq[ch-97]++;
        } 
         for (char ch : t.toCharArray()) {
        charFreq[ch-97]--;
        } 
        for(int i:charFreq){
            if(i!=0)return false;
        }
        return true;

    }
}
