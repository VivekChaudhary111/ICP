import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (c.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } else if (c.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (c.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            } else {
                st.push(Integer.parseInt(c));
            }
        }

        return st.peek();        
    }
}