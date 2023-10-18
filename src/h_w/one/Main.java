package h_w.one;

/**
 * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */

public class Main {
    public static void main(String[] args) {

        Collect<Integer> collect = new Collect<>();
        collect.add(2);
        collect.add(3);
        collect.add(4);
        collect.add(5);

        collect.printCollection();

        collect.dell(4);

        collect.printCollection();

        Collect<String> collectS = new Collect<>();
        collectS.add("Test");
        collectS.add("Red");
        collectS.add("Wite");
        collectS.add("Black");

        collectS.printCollection();

        collectS.dell("Red");


        collectS.printCollection();

    }
}