import java.util.Stack;

public class PushBottom {
    public static void pb(Stack<Integer> s, int d){
        if(s.isEmpty()){
            s.push(d);
            return;
        }
        int top = s.pop();
        pb(s, d);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int d = 4;
        pb(s, d);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }    
}
