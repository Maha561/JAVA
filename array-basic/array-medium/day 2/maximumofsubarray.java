

//Max Sum Subarray of size K
//lectureLink: https://www.youtube.com/watch?v=bhyCZYeCTMs


class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        
        int l =0;
        int r = 0;
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        
        while(r<arr.length){
            
            sum = sum+arr[r];
            
            if(r-l+1==k){
                
                maxSum = Math.max(sum,maxSum);
                
                sum = sum - arr[l];
                
                l++;
            }
          
               r++;
        
        
            
        }
         return maxSum;
        
        
        
    }
    //return maxSum;
}

// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1