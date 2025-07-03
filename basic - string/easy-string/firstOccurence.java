
// Find the first occurrence of the string pat in the string txt. The function returns an integer denoting the first occurrence of the string pat in txt (0-based indexing).

//Note: You are not allowed to use the inbuilt function. If there is no occurrence then return -1.

class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        for(int i =0 ; i<txt.length();i++){
            
            if(txt.charAt(i)==pat.charAt(0)){
                
                int j = 0;// pat
                int k = i;// txt
                while(j<pat.length()&&k<txt.length()&&pat.charAt(j)==txt.charAt(k)){
                    
                    j++;
                    k++;
                    if(j==pat.length()){
                        
                        return i;
                    }
                        
                }
            }
        }
        
        return -1;
        
    }
}

// https://www.geeksforgeeks.org/problems/implement-strstr/1?page=1&category=Strings&difficulty=Basic&sortBy=submissions
