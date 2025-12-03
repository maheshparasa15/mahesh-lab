package PracticePrograms;

public class IntStack {
    int[] stack;
    int top = -1;

    public IntStack(int size) {
        stack = new int[size];
    }

    public void push(int value) {
        if(top == stack.length - 1) {
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if(top == -1) {
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if(top == -1) {
            System.out.println("empty stack");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        IntStack stack = new IntStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("top element:"+ stack.peek());
        System.out.println("pop element:"+ stack.pop());
        System.out.println(" is empty:"+ stack.isEmpty());
        System.out.println(" is peek:"+ stack.peek());
    }
}
