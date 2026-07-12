class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l=0;
        int  win_size=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
              char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                 char left=s.charAt(l);

                 map.put(left,map.get(left)-1);
                 if(map.get(left)==0){
                            map.remove(left);
                              
                 }
                 l++;
               
               
            } 
              win_size=Math.max(win_size,r-l+1);

        }
        return win_size;
        
    }
}
