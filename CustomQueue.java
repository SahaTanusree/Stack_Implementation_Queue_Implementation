
import java.util.*;

class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isfull() {
        return end == data.length;

    }

    public boolean isempty() {
        return end == 0;
    }

    public boolean insertion(int item) {
        if (isfull()) {
            System.out.println("Queue is full!!!");
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty!!!");
        }
        int removed = data[0];
        // shift the element
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty!!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }

}
