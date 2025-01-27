package Stack;
import java.util.Stack;

//Balanced Parentheses Checker
//Given an expression string, write a Java program to check whether the parentheses in the expression are balanced or not. The types of parentheses to consider are curly {}, square [], and round ().

//Hint: Using stacks for parsing and balancing symbols.


//------------------------------------------------------------------------------
class Stack_method3{
    private Node peak; // Reference to the top of the stack
    private int length; // Tracks the size of the stack
    public Stack_method3() {
        this.peak = null;
        this.length = 0;
    }
    public void push(int value) {
        Node addedNode = new Node(value);
        if (this.length == 0) {
            this.peak = addedNode;
        } else {
            addedNode.next = this.peak;
            this.peak = addedNode;
        }
        this.length++;
    }
    public Node pop() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.peak;
        this.peak = this.peak.next;
        temp.next = null;
        this.length--;
        return temp;
    }

    static boolean isBalanced(String expression) {
        Stack<Character> obj = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                obj.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (obj.isEmpty()) {
                    return false;
                }
                char top = obj.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return obj.isEmpty();
    }

}
public class Balanced_Parentheses_Checker {
    public static void main(String[] args) {
        Stack_method3 obj = new Stack_method3();
        String expression = "{[()]}"; //example to check
        boolean result = obj.isBalanced(expression);
        System.out.println("The expression " + expression + " is balanced: " + result);

    }
}
