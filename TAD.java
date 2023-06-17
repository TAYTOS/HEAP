import java.util.ArrayList;

public class TAD <T extends Comparable<T>> {
    private ArrayList<T> data;
 
    public TAD() {
        this.data = new ArrayList<T>();
    }

    public ArrayList<T> getData() {
        return data;
    }
    
    public void insert(T x) {
        data.add(x);
        int ci = data.size() - 1;
        while (ci > 0) {
            int pi = (ci - 1) / 2;
            if (data.get(ci).compareTo(data.get(pi)) <= 0)
                break;
            T tmp = data.get(ci);
            data.set(ci, data.get(pi));
            data.set(pi, tmp);
            ci = pi;
        }
    }
    public T delete() {
        if (data.isEmpty())
            return null;

        T root = data.get(0);
        T last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            heapifyDown(0);
        }
        return root;
    }

    private void heapifyDown(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < data.size() && data.get(left).compareTo(data.get(largest)) > 0)
            largest = left;

        if (right < data.size() && data.get(right).compareTo(data.get(largest)) > 0)
            largest = right;

        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        T temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
    public String toString(){
        String s="";
        for(int i=0;i<data.size();i++){
            s+=data.get(i).toString()+", ";
        }
        return s;
    }
}
