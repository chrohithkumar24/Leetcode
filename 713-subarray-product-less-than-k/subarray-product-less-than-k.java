class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int n=nums.length;
        int Count=0;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j>=0;j--){
                product=product*nums[j];
                if(product<k){
                    Count++;
                }
                    else{
                        break;
                    }
            }
            
        }
        return Count;

        
    }
}