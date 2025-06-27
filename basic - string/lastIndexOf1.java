
// Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.

//Note: If '1' is not present, return "-1"
class Solution {
    public int lastIndex(String s) {
        for(int i = s.length() - 1 ; i>=0;i--){
            if(s.charAt(i)=='1'){
                return i;
                
            
            }
        }
        return -1;
    }
}

// gfg : https://www.geeksforgeeks.org/problems/last-index-of-15847/1?page=4&category=Arrays&difficulty=Basic,Easy&sortBy=submissions
