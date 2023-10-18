package h_w.two;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
 * divide(), subtract(). Параметры этих методов – два
 * числа разного типа, над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.0;

        Calculator calculator = new Calculator();

        System.out.println("Сумма: " + calculator.sum(a, b));
        System.out.println("Умножение: " + calculator.multiply(a, b));
        System.out.println("Деление: " + calculator.divide(a, b));
        System.out.println("Вычитание: " + calculator.subtract(a, b));
    }
}
