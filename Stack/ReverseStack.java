import java.util.Stack; // Importing the Stack class from java.util package

public class ReverseStack { // Class to reverse a stack using recursion

    // Recursive method to push an element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) { // Base case: If stack is empty, push the data and return
            s.push(data);
            return;
        }

        int top = s.pop(); // Remove the top element
        pushAtBottom(data, s); // Recursively call for the remaining stack
        s.push(top); // Push the removed element back after recursion completes
    }

    // Recursive method to reverse the stack
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) { // Base case: If stack is empty, return
            return;
        }

        int top = s.pop(); // Remove the top element
        reverse(s); // Recursively reverse the remaining stack

        pushAtBottom(top, s); // Insert the removed element at the bottom
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); // Creating a Stack object to store Integer values

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack); // Reverse the stack

        // Loop to print and remove elements from the reversed stack until it is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); // Prints the top element without removing it
            stack.pop(); // Removes the top element from the stack
        }
    }
}
