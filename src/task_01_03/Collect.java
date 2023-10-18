package task_01_03;

import java.util.Arrays;

/**
 * Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
 * возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */

public class Collect <T>{
    private T[] tArr = (T[]) new Object[10];


    public void add(T t){
        for (int i = 0; i < tArr.length; i++) {
            if(tArr[i] == null) {
                tArr[i] = t;
                break;
            }
        }
    }


    public void dell(T t){
        for (int i = 0; i < tArr.length; i++) {
            if(tArr[i] == t) {
                tArr[i] = null;
                break;
            }
        }
    }


    public void printCollection() {
        for (int i = 0; i < tArr.length; i++) {
            if(tArr[i] != null) {
                System.out.print(tArr[i] + " ");
            }
        }
        System.out.println();
    }
}
