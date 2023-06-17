public class PriorityQueueHeap<T extends Comparable<T>> {
    private TAD<T> heap;

    public PriorityQueueHeap() {
        heap = new TAD<>();
    }
    public void enqueue(T x){
        this.heap.insert(x);
    }
    
    public T dequeue() {
        return heap.delete();
    }
    public T front() {
        if (heap.getData().isEmpty())
            return null;

        return heap.getData().get(0);
    }
    public T back() {
        if (heap.getData().isEmpty())
            return null;

        return heap.getData().get(heap.getData().size() - 1);
    }

    public boolean isEmpty() {
        return heap.getData().isEmpty();
    }

    public int size() {
        return heap.getData().size();
    }
    public String toString(){
        return heap.toString();
    }
}
