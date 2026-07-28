class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsi[] = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            numsi[i]=nums[i];
            numsi[i+nums.length]=numsi[i];

        }
        return numsi;
    }
}