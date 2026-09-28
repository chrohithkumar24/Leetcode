class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>();
        for(int j=0;j<n;j++){

            while(!deque.isEmpty() && deque.peekFirst()<= j-k){
                deque.pollFirst();
            }
                while(!deque.isEmpty() && nums[deque.peekLast()]< nums[j]){
                    deque.pollLast();
                } 
                deque.addLast(j);
                if(j>=k-1){
                    result[j-k+1]=nums[deque.peekFirst()];                
                    }
        }
    
        
            
        
        return result;
    }
}