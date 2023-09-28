package code;

public class MyPriorityQueue_651617 implements MyQueueInterface{
    MyMinHeap heap = new MyMinHeap();

    @Override
    public void enqueue(int d) {
        if (!heap.isFull())
            heap.insert(d);
    }

    @Override
    public int dequeue() {
        if (!heap.isEmpty())
            return heap.remove();
        return -1;
    }

    @Override
    public int front() {
        if (!heap.isEmpty())
            return heap.peek();
        return -1;
    }

    @Override
    public boolean isFull() {
        return heap.isFull();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}