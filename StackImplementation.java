import java.util.*;

class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(34);
        stk.push(35);
        stk.push(36);
        stk.push(37);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
