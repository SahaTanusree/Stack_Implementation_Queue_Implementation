class DynamicStack extends CustsomStack {
    // Same as the custom stack nut the difference is Push Function
    public DynamicStack() {
        super();// it call customstack()
    }

    public DynamicStack(int size) {
        super(size);// it call customstack(int size)
    }

    public boolean push(int item) {
        if (this.isfull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            // copy
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // if array is not full
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        DynamicStack stk = new DynamicStack(3);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println("Top item is:" + stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }

}
