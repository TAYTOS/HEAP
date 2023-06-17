public class PriorityElement <T extends Comparable<T>> implements Comparable<PriorityElement<T>>{
    private T item;
    private int priority;

    public PriorityElement(T item, int priority) {
        this.item = item;
        this.priority = priority;
    }

    public T getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PriorityElement<T> x) {
        return Integer.compare(priority, x.getPriority());
    }
}
