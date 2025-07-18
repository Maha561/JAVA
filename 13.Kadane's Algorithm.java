

class Solution {
    int maxSubarraySum(int[] arr) {
        
        int curSum =0;
        int maxSum =Integer.MIN_VALUE;
        int n=arr.length;
        if(n==1){
            
            int ans = arr[0];
            
            return ans;
        }
        
        for(int i =0;i<arr.length;i++){
            
            curSum = curSum+arr[i];
            
            maxSum = Math.max(maxSum,curSum);
            
            if(curSum<0){
                
                curSum =0;
            }
        }
        return maxSum;
    
            
        }
        
        
    }
// lecture : https://www.youtube.com/watch?v=9IZYqostl2M&t=5s
//gfg: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/0

