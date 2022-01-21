// push, pop, peek takes O(1) time complexity

import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.size());
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

