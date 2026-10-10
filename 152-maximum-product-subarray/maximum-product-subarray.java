class Solution {
    public int maxProduct(int[] nums) {
        int maxAns=-10;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product*=nums[j];
                maxAns=Math.max(maxAns,product);
            }
        }
        return maxAns;
        
    }
}