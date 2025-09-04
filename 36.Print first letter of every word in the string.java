

// User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        
        String[] k = S.split(" ");
        
        StringBuilder result = new  StringBuilder();
        
        for(int i=0;i<k.length;i++){
            
            String word = k[i];
            
            result.append(word.charAt(0));
            
            
        }
        
        return result.toString();
        
        
    }
};

// https://www.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1
