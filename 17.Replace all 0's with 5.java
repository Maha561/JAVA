
class Solution {
    int convertfive(int num) {
       
       // convert num into string
       
       String str = Integer.toString(num);
       
       // now use replace method
       
       str = str.replace('0','5');
       
       // now convert to int
       
       return Integer.parseInt(str);
    }
}

//https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=2&category=Arrays&difficulty=Basic&sortBy=submissions