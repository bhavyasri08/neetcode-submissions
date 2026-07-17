class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int start=0;
        int val1=0;
        int val2=0;
        int total=0;
        for(int num:gas)   val1+=num;
        for(int arr:cost)  val2+=arr;
        if(val1<val2) return -1;
        for(int i=0;i<gas.length;i++){
              
             
             int diff=gas[i]-cost[i];
              total+=diff;
             if(total<0){
                start=i+1;
                total=0;
             }
        }
        return start;
    }
}
