
class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        
      int countLess = 0;
      int countLarge =0;
      
      for(int i =0;i<arr.length;i++){
          
          if(arr[i]<=target){
              countLess++;
              
          }
          if(arr[i]>=target){
              countLarge++;
              
          }
      }
     return new int[]{ countLess, countLarge};
      
        
    }
}
// https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1