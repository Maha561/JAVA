
// User function Template for Java

class Sol {
    Boolean check(String s) {
       
       char k = s.charAt(0);
       
       for(int i =1;i<s.length();i++){
           
           if(s.charAt(i)!=k)
           
           return false;
           
           
       }
       return true;
    }
}
// https://www.geeksforgeeks.org/problems/check-string1818/1