class Solution {
    public int maxProfit(int[] prices) {
        
        int longest=0;
        
       int n=prices.length;
       
        for(int i=0;i<=n-2;i++){
             int max=0;
            for(int j=i;j<=n-1;j++){
               if(max<=prices[j]){
                      max=prices[j];
               }
              
            }
            
             longest=Math.max(longest,max-prices[i]);
        }
        return  longest;
    }
}
