public class IntStack {
    int[] stack;
    int top;

    public IntStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if(top == stack.length - 1) {
            System.out.println("stack over flow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }


}
