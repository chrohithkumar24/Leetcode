class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int current_count=0;
        int max_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                current_count++;
            }else{
                max_count=Math.max(current_count,max_count);
                current_count=0;
            }
        }
        return Math.max(current_count,max_count);
        
    }
}