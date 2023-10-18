package task_04;

public class Slacker implements Person{
    @Override
    public void doWork() {
        System.out.println("Я не работаю");
    }

    @Override
    public void haveRest() {
        System.out.println("Я умею отдыхать");
    }
}
