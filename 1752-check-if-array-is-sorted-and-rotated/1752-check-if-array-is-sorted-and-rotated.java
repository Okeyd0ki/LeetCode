class Solution {
    public boolean check(int[] nums) {
        int test=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                test++;
            }
        }
        return test>1?false:true;
        
    }
}