
// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        HashSet<Character> word = new HashSet<>();
        
        for(int i =0;i<str2.length();i++){
            
            word.add(str2.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i =0;i<str1.length();i++){
            
            char c = str1.charAt(i);
            
            if(!word.contains(c)){
                
                result.append(c);
            }
        }
        return result.toString();
    }
}

// https://www.geeksforgeeks.org/problems/remove-character3815/0