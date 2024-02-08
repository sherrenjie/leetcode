class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            //if it is opening, then add it into the stack
           if(ch == '(' || ch =='{' || ch == '[') {
               st.push(ch);
            //check if stack is empty
           } else if(ch==')' || ch == '}'|| ch == ']') {
               if(st.isEmpty()){
                   return false;
               }
           }

           if(ch == ')') {
               if(st.peek() == '(') {
                   st.pop();
               } else{
                   return false;
               }
           }

            if(ch == '}') {
               if(st.peek() == '{') {
                   st.pop();
               } else{
                   return false;
               }
           }

            if(ch == ']') {
               if(st.peek() == '[') {
                   st.pop();
               } else {
                   return false;
               }
           }
    }
    if(st.isEmpty()) {
        return true;
    } else{
        return false;
    }
    }
}
