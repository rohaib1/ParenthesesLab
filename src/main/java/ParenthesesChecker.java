import java.util.Stack;

public class ParenthesesChecker {


    //MVP
    public boolean checkParentheses(String testString){

        Stack<Character> stack = new Stack<>();

        for (char character : testString.toCharArray()) {
            if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

