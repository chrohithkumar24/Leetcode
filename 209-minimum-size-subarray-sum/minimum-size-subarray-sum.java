class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int left=0;
        int sum=0;
            for(int j=left;j<n;j++){
                sum+=nums[j];
                while(sum>=target){
                    int length=j-left+1;
                    ans=Math.min(ans,length);
                    sum-=nums[left];
                    left++;
                }
                

            }
        
        if(ans==Integer.MAX_VALUE){
            return 0;
        }else{
            return ans;
        }
    }
}