
// lecture https://youtu.be/d4Tw4h5_t-4?si=b1DYPKN8tG_Wib-Q

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        
        int count0 = 0;
        
        int count1 = 0;
        
        int count2 = 2;
        
        for(int i =0 ;i<arr.length;i++){
            
            if(arr[i] == 0){
                
                count0++;
            }
            else if(arr[i]==1){
                
                count1++;
            }
            else{
                
                count2++;
            }
            
        
        }
        for(int j =0; j<count0;j++){
            
            arr[j]=0;
        }
        for(int k = count0;k<count0+count1;k++){
            
            arr[k] = 1;
        }
        for(int s = count0+count1;s<arr.length;s++){
            
            arr[s]=2;
        }
            
        
    
        
    }
}

// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions