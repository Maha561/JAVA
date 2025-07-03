
//  Given a non-empty sequence of characters s, return true if sequence is Binary, else return false.

class Solution {
    boolean isBinary(String s) {
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'){
                
                return false;

            }
        }
        return true;
        
    }
}

//https://www.geeksforgeeks.org/problems/check-for-binary/1?page=1&category=Strings&difficulty=Basic&sortBy=submissions

