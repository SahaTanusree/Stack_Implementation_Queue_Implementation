class CustsomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustsomStack() {
        this(DEFAULT_SIZE);
    }

    public CustsomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isfull()) {
            System.out.println("Stack is Full!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isempty() {
        return ptr == -1;
    }

    public int pop() throws StackException {
        if (isempty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isempty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws StackException {
        CustsomStack stk = new CustsomStack(3);
        stk.push(10);
        stk.push(11);
        stk.push(12);
        stk.push(13);
        System.out.println("Top of the  stack:" + stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

    }

}
