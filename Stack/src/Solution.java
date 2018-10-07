import java.util.Stack;

/**
 * @author: Young
 * @create: 2018-10-07 14:42
 **/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] brackets = s.toCharArray();

        for (int i = 0; i < brackets.length; i++) {
            char bracket = brackets[i];
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char out = stack.pop();

                if (bracket == ')' && out != '(') {
                    return false;
                }

                if (bracket == ']' && out != '[') {
                    return false;
                }

                if (bracket == '}' && out != '{') {
                    return false;
                }
            }
        }

        // 栈中的元素需要全部匹配完毕
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "[{}]";
        String s2 = "[{(}]";

        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
    }
}
