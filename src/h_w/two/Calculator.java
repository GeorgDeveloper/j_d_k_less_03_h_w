package h_w.two;

public class Calculator {

    // Метод для сложения двух чисел разного типа
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Метод для умножения двух чисел разного типа
    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Метод для деления двух чисел разного типа
    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    // Метод для вычитания двух чисел разного типа
    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }


}
