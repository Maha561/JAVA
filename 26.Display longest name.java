
class Solution {
    public String longest(List<String> arr) {
        
        String word =arr.get(0);
        for(int i =1;i<arr.size();i++){
            
            String current = arr.get(i);
            
            if(current.length()>word.length()){
                
                word = current;
            }
            
        }
        return word;
    }
}

// https://www.geeksforgeeks.org/problems/display-longest-name0853/1