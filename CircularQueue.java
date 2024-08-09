class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isfull() {
        return size == data.length;

    }

    public boolean isempty() {
        return size == 0;
    }

    public boolean insertion(int item) {
        if (isfull()) {
            System.out.println("Queue is full!!!");
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty!!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty!!!");
        }
        return data[front];
    }

    public void display() {
        if (isempty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;

        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cque = new CircularQueue(3);
        cque.insertion(1);
        cque.insertion(2);
        cque.insertion(3);
        cque.display();
        System.out.println("Remove Item:" + cque.remove());
        cque.insertion(33);
        cque.display();
    }

}
