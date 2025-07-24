

// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int first = -1;
        int last =-1;
        
        
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]==x){
                
                first=i;
                break;
            }
            
        }
        
        // if not found
        if(first==-1){
            result.add(-1);
            return result;
           
            
        }
        
        for(int i=arr.length-1;i>=0;i--){
            
            if(arr[i]==x){
            last= i;
            break;
            
                
            }
            
        }
        
        result.add(first);
        result.add(last);
        
        
        
        
    
        return result;
        
       
        
        
    }
}

//https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x2041/1?page=6&category=Arrays&difficulty=Basic,Easy&sortBy=submissions