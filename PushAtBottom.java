import java.util.*; // Importing all utility classes including Stack

public class PushAtBottom { // Class to demonstrate inserting an element at the bottom of the stack

    // Recursive method to push an element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) { // Base case: If stack is empty, push the data and return
            s.push(data);
            return;
        }

        int top = s.pop(); // Remove the top element
        pushAtBottom(data, s); // Recursively call for the remaining stack
        s.push(top); // Push the top element back after recursion completes
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); // Creating a Stack object to store Integer values

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        pushAtBottom(10, stack); // Insert 10 at the bottom of the stack

        // Loop to print and remove elements from the stack until it is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); // Prints the top element without removing it
            stack.pop(); // Removes the top element from the stack
        }
    }
}
