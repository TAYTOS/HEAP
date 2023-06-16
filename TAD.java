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
}
