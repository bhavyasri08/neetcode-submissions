class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

   Map< String,List<String> > map=new HashMap<>();
        int i=0;
        while(i<strs.length){
           String s=strs[i];

           char[] arr=s.toCharArray();
           Arrays.sort(arr);
           String sorted=new String(arr);

           if(map.containsKey(sorted)){
            map.get(sorted).add(s);
           }else{
            List<String> list=new ArrayList<>();
            list.add(s);
            map.put(sorted,list);
           }
           i++;


        }
        return new ArrayList<>(map.values());
        
    }
}
