package task_01_03;

/**
 * Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K),
 * конструктор, принимающий на вход параметры типа (T, V, K), методы
 * возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
 * классов для трех переменных класса. Наложить ограничения на параметры типа: T должен реализовать интерфейс
 * Comparable (классы оболочки, String), V должен реализовать интерфейс DataInput и расширять класс InputStream, K должен расширять класс
 * Number
 */

public class Main {
    public static void main(String[] args) {

//        try {
//            TestClass testClass = new TestClass<>("Hello",new DataInputStream(new FileInputStream("test.txt")), 34);
//            testClass.printClass();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


//        task_01_03.Collect<Integer> collect = new task_01_03.Collect<>();
//        collect.add(2);
//        collect.add(3);
//        collect.add(4);
//        collect.add(5);
//
//        collect.printCollection();
//
//        collect.dell(4);
//
//        collect.printCollection();
//
//        task_01_03.Collect<String> collectS = new task_01_03.Collect<>();
//        collectS.add("Test");
//        collectS.add("Red");
//        collectS.add("Wite");
//        collectS.add("Black");
//
//        collectS.printCollection();
//
//        collectS.dell("Test");
//
//        collectS.printCollection();

        Integer[] integers = new Integer[5];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }

        MainIterratorr<Integer> mainIterrator = new MainIterratorr<>(integers);

        while (mainIterrator.hasNext()){
            System.out.print(mainIterrator.next() + " ");
        }

        String[] strings = new String[5];
        strings[0] = "Test0";
        strings[1] = "Test1";
        strings[2] = "Test2";
        strings[3] = "Test3";
        strings[4] = "Test4";


        MainIterratorr<String> mainIterratorS = new MainIterratorr<>(strings);

        while (mainIterratorS.hasNext()){
            System.out.print(mainIterratorS.next() + " ");
        }
    }
}