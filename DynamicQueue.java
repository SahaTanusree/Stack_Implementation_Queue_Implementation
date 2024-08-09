class DynamicQueue extends CircularQueue {
    // Same as the custom stack nut the difference is Push Function
    public DynamicQueue() {
        super();// it call customstack()
    }

    public DynamicQueue(int size) {
        super(size);// it call customstack(int size)
    }

    public boolean insertion(int item) {
        if (this.isfull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            // copy
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;

        }
        // if array is not full
        return super.insertion(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicQueue deq = new DynamicQueue(3);
        deq.insertion(3);
        deq.insertion(31);
        deq.insertion(32);
        deq.display();
    }

}
