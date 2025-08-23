
class Solution {
    String removeVowels(String s) {
        
        StringBuilder result = new StringBuilder();
        
        for(int i =0;i<s.length();i++){
            
            
            
            char c =s.charAt(i);
            
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                continue;
                
            }
            else{
                
                result.append(c);
                
            }
        }
        
        return result.toString();
        
        
        
    }
}

// https://www.geeksforgeeks.org/problems/remove-vowels-from-string1446/1?page=3&category=Strings&difficulty=Basic,Easy&sortBy=submissions