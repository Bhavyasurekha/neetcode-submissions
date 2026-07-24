class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int mini = 1;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
        }
        int k=0;
        while(mini!=-1){
            if(hs.contains(mini)){
                mini++;
            }else{
                k=mini;
                mini=-1;
            }
        }
        return k;

    }
}