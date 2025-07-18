

class Solution {
    int longestUniqueSubstring(String s) {
        // question - return length of the substring by avoid repeating character
        
        // ie. we need to create a substring
        // its should not contain repeating character
        
        // using sliding window approach
        
        int l=0;
        int r=0;
        int maxLength=0;
        
        // hashSet to keep track of the character
        // why we are using hashSet
       // because  set datastructure wont allow duplicate value
        
        HashSet<Character> set = new HashSet<>();
        
        // slide the window
        while(r<s.length()){
            
            char ch = s.charAt(r);
            
            if(!set.contains(ch)){
                
                // add to the set
                set.add(ch);
                
                // update the max
                maxLength = Math.max(maxLength,r-l+1);
                r++;
                
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLength;
        
    }
}
