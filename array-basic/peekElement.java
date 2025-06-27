
// print the peek element
class Solution {

    public int peakElement(int[] arr) {
        int n = arr.length;
        if(n==1){
            return 0 ;
        }
        // this part is not necessary . but plss include it because during the test case it 
        //is asking what will be the ans if their is only one peek element
        for(int i  =0 ;i<n;i++){
            
            
            
            if(i == 0){
                if(arr[i]>arr[i+1]){
                    return i;
                }
                
            
            }
            else if(i==n-1){
                
                if(arr[i]>arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i] > arr[i-1]&& arr[i] > arr[i+1]){
                    
                    return i;
                }
            }
        }
        return 0;
        
    }
}
// logic : simple just use conditional statement
//gfg link : https://www.geeksforgeeks.org/problems/peak-element/1?page=1&category=Arrays&difficulty=Basic,Easy&sortBy=submissions