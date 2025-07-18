

class Solution {
    int majorityElement(int arr[]) {
        
    int freq =0;
    int num=0;
    // edge case--if array size is 2
    int n = arr.length;
    if(n==2){
        if(arr[0]==arr[1]){
            
           num = arr[0];
           return num;
           
        }
        else{
            return -1;
        }
        
    }
    
    for(int i =0;i<arr.length;i++){
        
        if(freq==0){
            
            num = arr[i];
            
        }
        
        if(num==arr[i]){
            
            freq++;
        }
        else{
            freq--;
        }
        
    }
    
    int count =0;
    for(int i =0;i<n;i++){
        
        if(arr[i]==num){
            count++;
        }
    }
    
    if(count>n/2){
        
        return num;
    }
    
   return -1;
    
    
        
    }
}

// lecture video : https://www.youtube.com/watch?v=_xqIp2rj8bo&t=1959s
// gfg; https://www.geeksforgeeks.org/problems/majority-element-1587115620/0
