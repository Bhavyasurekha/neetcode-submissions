class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int k = nums.length/3;
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        for(Integer i: hm.keySet()){
            if(hm.get(i)>k){
                ll.add(i);
            }
        }
        return ll;
    }
}