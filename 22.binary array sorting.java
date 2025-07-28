
class Solution {
    public void binSort(int[] arr) {
        
        int count0=0;
        int count1=0;
        
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]==0){
                
                count0++;
                
            }
            else{
                count1++;
            }
        }
        
        for(int i=0;i<count0;i++){
            
            arr[i]=0;
        }
        
        for(int i=count0;i<arr.length;i++){
            arr[i]=1;
        }
            
        
    }
}

// https://www.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
