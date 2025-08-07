
class Solution {
    int LastIndex(String s, char p) {
        
       int count = -1;
       
       
       for(int i =0;i<s.length();i++){
           
           if(s.charAt(i)==p){
               
               count=i;
           }
       }
       
       return count;
        
    }
}

//https://www.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1?page=1&category=Strings&difficulty=Basic,Easy&sortBy=submissions
