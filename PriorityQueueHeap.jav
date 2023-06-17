public class PriorityQueueHeap<T extends Comparable<T>> {
    private TAD<PriorityElement<T>> heap;

    public PriorityQueueHeap() {
        heap = new TAD<>();
    }
    public void enqueue(T x, int prioridad){
        PriorityElement<T> element = new PriorityElement<>(x, prioridad);
        heap.insert(element);
    }
    
    public T dequeue() {
        PriorityElement<T> element = heap.delete();
        return element.getItem();
    }
    public T front() {
        if (heap.getData().isEmpty())
            return null;
        PriorityElement<T> element = heap.getData().get(0);
        return element.getItem();
    }
    public T back() {
        if (heap.getData().isEmpty())
            return null;
        PriorityElement<T> element = heap.getData().get(heap.getData().size() - 1);
        return element.getItem();
    }

    public boolean isEmpty() {
        return heap.getData().isEmpty();
    }

    public int size() {
        return heap.getData().size();
    }
    public String toString(){
        String s="";
        for(int i=0;i<heap.getData().size();i++){
            s+=heap.getData().get(i).getItem()+", ";
        }
        return s;
    }
}
