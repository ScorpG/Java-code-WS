import java.util.*;

public class DataStructureConverter
 {
    public static Stack<Integer> arrayToStack(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        return stack;
    }
   
    public static int[] stackToArray(Stack<Integer> stack) {
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
   
    public static Queue<Integer> arrayToQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        return queue;
    }
   
    public static int[] queueToArray(Queue<Integer> queue) {
        int[] arr = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            arr[i] = queue.poll();
            i++;
        }
        return arr;
    }
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
       
        Stack<Integer> stack = arrayToStack(arr);
        System.out.println("Stack: " + stack);
       
        int[] arrFromStack = stackToArray(stack);
        System.out.println("Array from Stack: " + Arrays.toString(arrFromStack));
       
        Queue<Integer> queue = arrayToQueue(arr);
        System.out.println("Queue: " + queue);
       
        int[] arrFromQueue = queueToArray(queue);
        System.out.println("Array from Queue: " + Arrays.toString(arrFromQueue));
    }
}
