import java.util.*;

class ImplementationArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("Remove first:" + deque.removeFirst());
        System.out.println("Remove last:" + deque.removeLast());
    }

}
