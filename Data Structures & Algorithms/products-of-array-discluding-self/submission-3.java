class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod =1;
        int zc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
            if(nums[i]!=0){
            prod=prod*nums[i];

            }
        }
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && zc==0){
                arr[i]=prod/nums[i];
            }else if(zc==1){
                if(nums[i]==0){
                    arr[i]=prod;
                }else{
                    arr[i]=0;
                }
            }else if(zc>1){
                arr[i]=0;
            }

        }
        return arr;
    }
}  
