class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

     Set<List<Integer>> set=new HashSet<>();
      
         int n=nums.length;
         Arrays.sort(nums);
        for(int i=0;i<=n-3;i++){
           int left=i+1;
           int right=n-1;
            while(left<right){
                List<Integer> list=new ArrayList<>();
                int sum=nums[i]+nums[left]+nums[right];
                 if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    Collections.sort(list);
                    set.add(list);
                    left++;
                    right--;
                 }else if(sum>0){
                        right--;
                 }else{
                    left++;
                 }
            }

        }

        return new ArrayList<>(set);
    }
}
