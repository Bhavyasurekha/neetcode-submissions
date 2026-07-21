class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count>=n){
                return nums[i];
            }
        }
        return -1;
    }
}