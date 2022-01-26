import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
// Time:
// Enqueue:O(1)
// Dequeue:O(1)
// Peek:O(1)
public class CollfrmQue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(1);
        q2.add(2);
        while(!q2.isEmpty()){
            System.out.print(q2.peek() + " ");
            q2.remove();
        }
    }
}
