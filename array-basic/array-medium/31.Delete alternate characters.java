

// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        
        StringBuilder result = new StringBuilder();
        
        for(int i =0; i<S.length();i++){
            
            if(i%2==0){
                
                result.append(S.charAt(i));
            }
        }
        
        return result.toString();
        
    }
}

// https://www.geeksforgeeks.org/problems/java-delete-alternate-characters4036/0