// Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

class Solution {
    public static int firstRepeated(int[] arr) {
         HashMap<Integer,Integer> count = new HashMap<>();
         // getting frequency
         for(int num : arr){
            count.put(num,count.getOrDefault(num,0)+1);
         }
         
         // find the first repeating
         for(int i =0; i<arr.length;i++){
             // get method ,get the frequency
             if(count.get(arr[i]) >1){
                 
                 return i+1;
             }
         }
         return -1;
         
         
         
         
        
    }
}

// gfg link : https://www.geeksforgeeks.org/problems/first-repeating-element4018/1