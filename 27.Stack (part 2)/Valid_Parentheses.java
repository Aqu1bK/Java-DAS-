// Valid Parentheses
//Given a string s containing just the characters '(',')', '{','}', '['and']', determine of
// the Input string is valid.
//An input string id valid id:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.
import java.util.*;

public class Valid_Parentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') { //opening bracket
                s.push(ch);
            } else { //closing
                if(s.isEmpty()) {
                    return false;
                }
                if( (s.peek() == '(' && ch == ')')  //()
                    || (s.peek() == '{' && ch == '}') //{}
                    || (s.peek() == '[' && ch == ']') ) {//[]
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        String str ="({})[]"; //true
        System.out.println(isValid(str));

    }
}
