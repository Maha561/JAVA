

// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        
        
        // creating an array of string datatype
        
        String[] k = s.split(" ");
        
        //s.split(" ")
        //["hello", "world", "java"]
        
        // creating string buider to modify the string
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<k.length;i++){
            
            String word = k[i];
            
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            
        }
        
        return result.toString().trim();
        
    }
}

// https://www.geeksforgeeks.org/problems/upper-case-conversion5419/1