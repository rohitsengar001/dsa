package dsa1.duplicatebracket;

import java.util.Stack;

public class Solution {
    public void duplicateBracket(String str) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (st.peek() == '(') {
                    System.out.println("true");
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(str.charAt(i));
            }
        }
        System.out.println("false");
    }

    public static void main(String[] args) {
        String str = "((a+b)+c))";
        new Solution().duplicateBracket(str);
    }
}
