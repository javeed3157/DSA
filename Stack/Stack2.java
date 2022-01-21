// push, pop, peek takes O(1) time complexity

import java.util.ArrayList;

public class Stack2 {
    private ArrayList<Integer> list;
    Stack2(){
        list = new ArrayList<>();
    }
    public boolean isEmpty(){
        return list.size() == 0;
    }
    public void push(int data){
        list.add(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size() - 1);
    }
    public int len(){
        return list.size();
    }
    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.len());
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
