package code5;

public class MyArrDemo<T> {
    public final int MAX_SIZE = 9;
    private int size = 0;
    private Object[] arr = new Object[MAX_SIZE];

    public void add(T instance) {
        arr[size++] = instance;
    }

    public void set(int i, T instance) {
        arr[i] = instance;
    }

    public T get(int i) {
        @SuppressWarnings("unchecked")
        final T element = (T) arr[i];
        return element;
    }

    public void swap(int i, int j) {
        // your code
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int currentSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("My snapshot looks like this -> ");
        for (int i = 0; i < size; i++)
            sb.append(arr[i] + ",");
        return sb.toString();
    }

    public void selectionSort(MyArrDemo<SillyLuckyNumber> arr) {
        int n = arr.currentSize();
    
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
    
            for (int j = i + 1; j < n; j++) {
                // Compare SillyLuckyNumber objects based on their luckyNumber
                SillyLuckyNumber elementI = arr.get(minIndex); // Use minIndex instead of i
                SillyLuckyNumber elementJ = arr.get(j);
    
                if (elementJ.getLuckyNumber() < elementI.getLuckyNumber()) {
                    minIndex = j;
                }
            }
    
            // Swap the found minimum element with the current element at i
            if (minIndex != i) {
                arr.swap(i, minIndex);
            }
        }
    }
    
    
    
}

