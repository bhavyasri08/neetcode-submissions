class Solution {
    // int leftmax(int num,int[] height){
    //  int max=0;
    //     for(int i=num-1;i>=0;i--){
    //          if(max<height[i]){
    //             max=height[i];
    //          }
    //     }
    //     return max;

    // }
    // int rightmax(int num,int[] height){
    //  int max=0;
    //     for(int i=num+1;i<height.length;i++){
    //          if(max<height[i]){
    //             max=height[i];
    //          }
    //     }
    //     return max;

    // }
    public int trap(int[] height) {

     int n=height.length;
     int[] pre=new int[n];
     int[] suf=new int[n];
     pre[0]=height[0];
     for(int i=1;i<n-1;i++){
           pre[i]=Math.max(pre[i-1],height[i]);
     }

     suf[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
           suf[i]=Math.max(suf[i+1],height[i]);
     }
     int total=0;
        for(int i=0;i<n;i++){
             int prev_max= pre[i];
             int next_max= suf[i];
             int max=Math.min(prev_max,next_max);
             int water_stored=max-height[i];
             if(water_stored>0){
                total+=water_stored;
             }

        }
        return total;
        
    }
}
