
public class MyQueue {

    private Object[] queue;
    private int maxSize;
    private int size;
    private int front;
    private int end;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        end = -1;
        front = 0;
        size = 0;
    }

    public void add(Object value) {
        if (end == maxSize - 1) {
            end = -1;
            front = 0;
        }
            queue[++end] = value;
            size++;
    }

    public void clear() {
        queue = new Object[maxSize];
        end = -1;
        front = 0;
        size = 0;

    }

    public int size() {
        return size;
    }

    public void peek() {
        if (!(queue[front] == null)) {
            System.out.println(queue[front]);
        } else {
            System.out.println("queue is empty");
        }
    }

        public void poll() {
            if (size == 0) {
                queue = new Object[maxSize];
                front = 0;
            }
        Object result = queue[front++];
        if (front == maxSize) {
            queue = new Object[maxSize];
            front = 0;
        }
        if (size > 0) {
            size--;
        }
            System.out.println(result);
        }
    }

