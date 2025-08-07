
class Solution {
    public String removeConsecutiveCharacter(String s) {
        
        StringBuilder result = new StringBuilder();
        
        if(s.length()==0){
            
            return s;
        }
        
        result.append(s.charAt(0));
        
        for(int i =1;i<s.length();i++){
            
            if(s.charAt(i)!=s.charAt(i-1)){
                
                result.append(s.charAt(i));
            }
            
            
            
            
        }
        
        return result.toString();
    }
}

// https://www.geeksforgeeks.org/problems/consecutive-elements2306/1?page=1&category=Strings&difficulty=Basic,Easy&sortBy=submissions
