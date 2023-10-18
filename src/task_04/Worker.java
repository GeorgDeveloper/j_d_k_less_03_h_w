package task_04;

public class Worker implements Person{

    @Override
    public void doWork() {
        System.out.println("Я работаю");
    }

    @Override
    public void haveRest() {
        System.out.println("Я не умею отдыхать");
    }
}
