
class Solution {
    public void segregateElements(int[] arr) {
        
        int n = arr.length;
        int arr1[] = new int[n];
        int index=0;
        for(int i =0;i<n;i++){
            
            if(arr[i]>=0){
                
                arr1[index++]=arr[i];
                
            }
        }
        
        for(int i =0;i<n;i++){
            
            if(arr[i]<0){
                
                arr1[index++]=arr[i];
                
            }
        }
        //arr.clear();
        
        for(int i =0;i<n;i++){
            
            arr[i]=arr1[i];
        }
        
        
        
       //return arr;
        
        
    }
}
//https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1?page=2&category=Arrays,Strings&difficulty=Basic,Easy&status=unsolved&sortBy=submissions