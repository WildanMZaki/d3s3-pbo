public class ArrayStack {
    private int maxsize;
    private int top;
    private int[] items;

    public ArrayStack(int maxsize) {
        if (maxsize <= 0)
            throw new ArrayStackException("Stack size must be positive");
        items = new int[maxsize];
        this.maxsize = maxsize;
        top = 0;
    }

    public void push(int item) {
        if (top == items.length)
            throw new ArrayStackException("Overflow Error");
        items[top] = item;
        top++;
    }

    public int pop() {
        if (isEmpty())
            throw new ArrayStackException("Underflow Error");
        return items[--top];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public static class ArrayStackException extends RuntimeException {
        public ArrayStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // stack.push(4); // overflow error
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

