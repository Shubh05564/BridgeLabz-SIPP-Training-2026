public class CallStack {

    // Node class
    private static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    // Top of stack
    private Frame top = null;

    // Push operation
    public void push(String functionName) {
        top = new Frame(functionName, top);
    }

    // Pop operation
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("No active call to return from");
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    // Peek operation
    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Call Stack is Empty");
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Call Stack is Empty");
            return;
        }

        Frame temp = top;

        System.out.println("Current Call Stack:");

        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validateUser()");

        stack.display();

        System.out.println("\nCurrent Function: " + stack.peek());

        System.out.println("Returned From: " + stack.pop());

        System.out.println("\nAfter Pop:");
        stack.display();
    }
}