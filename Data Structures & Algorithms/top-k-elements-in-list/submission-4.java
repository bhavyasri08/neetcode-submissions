class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] arr=new int[k];
Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
 PriorityQueue <int[]> pq=new PriorityQueue<>(
            (a,b)->b[1]-a[1]
        );

        for(int key:map.keySet()){
                 pq.add(new int[]{key,map.get(key)});

        }
       int i=0;
     while(k>0){
         
         int[] pair=pq.poll();
         arr[i]=pair[0];
         i++;
         k--;
     }
       return arr;
        
    }
}
