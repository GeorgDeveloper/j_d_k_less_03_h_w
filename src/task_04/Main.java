package task_04;

import java.util.ArrayList;

/**
 * Описать интерфейс Person с методами doWork() и haveRest(). Написать два класса работник и бездельник,
 * реализующих интерфейс. Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать,
 * но умеет отдыхать. Написать обобщённые классы Workplace и Club, содержащие массив из Person. В классах необходимо
 * вызывать у всего массива людей вызывать соответствующие методы.
 */
public class Main {
    public static ArrayList<Person> people;

    public static void main(String[] args) {
        people = new ArrayList<>();
        people.add(new Worker());
        people.add(new Slacker());
        people.add(new Worker());
        people.add(new Slacker());
        people.add(new Worker());

        new Workplace(people).getPeople();
        new Club(people).getPeople();
    }
}
