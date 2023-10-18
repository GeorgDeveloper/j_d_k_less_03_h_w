package h_w.one;

/**
 * Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
 * возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */

public class Collect<T> {
    private T[] tArr = (T[]) new Object[10];
    private int cnt;


    public void add(T t) {
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                tArr[i] = t;
                break;
            }
        }
    }


    public void dell(T t) {
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == t) {
                tArr[i] = null;
                break;
            }
        }
    }


    public void printCollection() {
        cnt = 0;
        while (hasNext()) {
            System.out.print(next() + " ");
        }
        System.out.println();
    }


    public boolean hasNext() {
        if (cnt < tArr.length && tArr[cnt] != null) return true;
        else if (cnt < tArr.length && tArr[cnt + 1] != null) return true;
        else return false;
    }

    public T next() {
        if (hasNext()) {
            return tArr[cnt++];
        }
        return null;
    }
}
