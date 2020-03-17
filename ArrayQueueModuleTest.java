
package queue;
import java.util.*;

public class ArrayQueueModuleTest {
    public static void fill() {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
    }

    public static void dump() {
        while (!ArrayQueueModule.isEmpty()) {
            System.out.println(ArrayQueueModule.size() + " " +
            ArrayQueueModule.element() + " " + ArrayQueueModule.dequeue());
        }
    }

    public static void main(String[] args) {
        fill();
        System.out.println(ArrayQueueModule.toStr());
        dump();
        System.out.println(ArrayQueueModule.toStr());
    }
}
