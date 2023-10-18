package h_w.three;

public class Main {

    static ArrayComparer arrayComparer = new ArrayComparer();
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println("Arrays are equal: " + arrayComparer.compareArrays(intArray1, intArray2));

        String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "cherry"};
        System.out.println("Arrays are equal: " + arrayComparer.compareArrays(strArray1, strArray2));

        Double[] doubleArray1 = {1.1, 2.2, 3.3};
        Double[] doubleArray2 = {1.1, 2.2, 3.3};
        System.out.println("Arrays are equal: " + arrayComparer.compareArrays(doubleArray1, doubleArray2));

        Double[] doubleArray3 = {1.1, 2.3, 3.3};
        Double[] doubleArray4 = {1.1, 2.2, 3.3};
        System.out.println("Arrays are equal: " + arrayComparer.compareArrays(doubleArray3, doubleArray4));
    }
}
