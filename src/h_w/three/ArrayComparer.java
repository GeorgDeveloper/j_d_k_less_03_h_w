package h_w.three;

public class ArrayComparer {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false; // Если массивы имеют разную длину, они не могут быть одинаковыми.
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // Если элементы не совпадают, массивы разные.
            }
        }

        return true; // Если не было обнаружено различий, массивы одинаковые.
    }


}

