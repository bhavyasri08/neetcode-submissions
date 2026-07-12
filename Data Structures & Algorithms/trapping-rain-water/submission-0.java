class Solution {
    int leftmax(int num,int[] height){
     int max=0;
        for(int i=num-1;i>=0;i--){
             if(max<height[i]){
                max=height[i];
             }
        }
        return max;

    }
    int rightmax(int num,int[] height){
     int max=0;
        for(int i=num+1;i<height.length;i++){
             if(max<height[i]){
                max=height[i];
             }
        }
        return max;

    }
    public int trap(int[] height) {

     int n=height.length;
     int total=0;
        for(int i=0;i<n;i++){
             int prev_max= leftmax(i,height);
             int next_max= rightmax(i,height);
             int max=Math.min(prev_max,next_max);
             int water_stored=max-height[i];
             if(water_stored>0){
                total+=water_stored;
             }

        }
        return total;
        
    }
}
