class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int n=nums.length;
        int Count=0;
        int left=0;
        // for(int i=0;i<n;i++){
            int product=1;
            for(int right=left;right<n;right++){
                product=product*nums[right];
                while(product>=k){
                    product /=nums[left];
                    left++;
                }
                Count+=right-left+1;
                    
            }
            
            
    
        return Count;

        
    }
}