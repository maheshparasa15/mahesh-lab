public class IntStackMain {

    public static void main(String[] args) {
        IntStack stack = new IntStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20

    }
}
