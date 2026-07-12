class Solution {
    // public int maxProfit(int[] prices) {
        
    //     int longest=0;
    //       int n=prices.length;
    //      int[] suf=new int[n];
    //       suf[n-1]=prices[n-1];
       
    //     for(int i=0;i<=n-2;i++){
    //          int max=0;
    //         for(int j=i;j<=n-1;j++){
    //            if(max<=prices[j]){
    //                   max=prices[j];
    //            }
              
    //         }
            
    //          longest=Math.max(longest,max-prices[i]);
    //     }


    //     return  longest;
    // }
     public int maxProfit(int[] prices) {
        
        int longest=0;
          int n=prices.length;
         int[] suf=new int[n];
          suf[n-1]=prices[n-1];
       for(int i=n-2;i>=0;i--){
          suf[i]=Math.max(suf[i+1],prices[i]);
       }
       int max=0;
        for(int i=0;i<=n-1;i++){
            int dif=suf[i]-prices[i];
            max= Math.max(dif,max);
       

        }
        return max;
      
    }
}
