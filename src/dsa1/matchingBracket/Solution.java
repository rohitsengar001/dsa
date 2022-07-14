package dsa1.matchingBracket;

import java.util.Stack;

public class Solution {
    public boolean matchingBracket(String str){
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (isOpening(c)){
                st.push(c);
            }else {
                if(st.isEmpty()){
                    return false;
                }else if(!isMatching(st.peek(),c)){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    boolean isMatching(Character a , Character b){
        return (a =='(' && b ==')') || (a =='{' && b =='}') || (a =='[' && b ==']');
    }
    boolean isOpening(Character ch){
        return ch == '(' || ch == '{' || ch == '[';
    }
    public static void main(String[] args) {
        String str ="[{()}])";
        System.out.println(new Solution().matchingBracket(str));
    }
}
