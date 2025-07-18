

class Solution {
    public String reverse(String S) {
        // initializarion of stack
        
        Stack<Character> stack = new Stack<>();
        
        // pushing all the characters into the stack
        
        for(int i =0;i<S.length();i++){
            
            stack.push(S.charAt(i));
        }
        
        // creating stringBuilder
        //because we cant modify string
        
        StringBuilder reverse = new StringBuilder();
        
        // pop all the character from stack 
        // stack follws last-in - first-out
        
        while(!stack.isEmpty()){
            
            reverse.append(stack.pop());
        }
        
        // now we need to convert stringBuider to string
        // because the return type is string
        // for this use toString()
        
        return reverse.toString();
        
    }
}

// https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1?page=1&category=Strings&difficulty=Basic,Easy&sortBy=submissions

