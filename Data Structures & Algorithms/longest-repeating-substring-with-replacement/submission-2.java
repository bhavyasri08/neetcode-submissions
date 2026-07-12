class Solution {
    public int characterReplacement(String s, int k) {
    
        int l=0;
        // Map<Character,Integer> freq=new HashMap<>();
        int max=1;
        int max_len=0;
        int[] freq=new int[26];
        for(int r=0;r<s.length();r++){
          char c=s.charAt(r);
            freq[c-'A']++;
            max=Math.max(max, freq[c-'A']);

            while((r-l+1)-max>k){
                char ch=s.charAt(l);
                       freq[ch-'A']--;
                       l++;

            } 
            max_len=Math.max(max_len,r-l+1);


        }
        return max_len;
    }
}
