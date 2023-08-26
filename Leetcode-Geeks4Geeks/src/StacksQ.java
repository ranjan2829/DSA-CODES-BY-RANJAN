package src;

public class StacksQ {
    class MyQueue {
        int front = 0;
        int end = 0;
        int size = 0;
        int[] arr;  // Declare the array as an instance variable

        public MyQueue() {
            arr = new int[100];
        }

        public void push(int x) {
            arr[end] = x;
            end = (end + 1) % arr.length;  // Circular index update
            size++;
        }

        public int pop() {
            int rem = arr[front];
            front = (front + 1) % arr.length;  // Circular index update
            size--;
            return rem;
        }

        public int peek() {
            return arr[front];
        }

        public boolean empty() {
            return size == 0;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
