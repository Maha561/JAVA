
//Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

//Note: The array consists of only positive and negative integers and not zero.//
import java.util.*; //in gfg you no need to import this
class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int num : arr){
            
            count.put(num ,count.getOrDefault(num,0)+1);
        }
        
        for(int i = 0 ; i<arr.length;i++){
            
            if(count.get(arr[i])==1){
                
                // return the element
                return arr[i];
            }
        }
        return 0;
        
    }
}

// gfg link : https://www.geeksforgeeks.org/problems/non-repeating-element3958/1