// rotate an array

// lecture : https://www.youtube.com/watch?v=_g6M2LuRAqw - reverse an array - conquero victorty

//https://www.youtube.com/watch?v=kZtCKsuW2wA -- rotate an array--conquer victory

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        
        int n = arr.length;
        
        if(d==0 || d==n){
            
            return ;
        }
        
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
        
        
    }
    
    static void reverse(int[] arr,int start,int end){
            
            while(start<end){
                
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}


//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions

