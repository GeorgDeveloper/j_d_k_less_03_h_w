package h_w.four;

public class Main {

    /**
     *Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
     * Класс должен иметь методы getFirst(), getSecond() для получения значений
     * пары, а также переопределение метода toString(), возвращающее строковое представление пары
     *
     */

    public static void main(String[] args) {
        Pair<Integer, String> intStringPair = new Pair<>(42, "Hello");
        System.out.println("First: " + intStringPair.getFirst());
        System.out.println("Second: " + intStringPair.getSecond());
        System.out.println("Pair: " + intStringPair);

        Pair<String, Double> stringDoublePair = new Pair<>("OpenAI", 3.14);
        System.out.println("First: " + stringDoublePair.getFirst());
        System.out.println("Second: " + stringDoublePair.getSecond());
        System.out.println("Pair: " + stringDoublePair);
    }
}
