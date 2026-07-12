class Solution {
    public boolean isPalindrome(String s) {
        
         s=s.replaceAll("[^a-zA-Z0-9]","");
         String str= s.toLowerCase();
         StringBuilder sb=new StringBuilder(str);
         String str2=sb.reverse().toString();
         if(str2.equals(str)){
            return true;
         }
         return false;
    }
}
