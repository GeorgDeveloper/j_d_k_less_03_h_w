package task_04;

import java.util.ArrayList;

public class Workplace {
   private ArrayList<Person> people;

    public Workplace(ArrayList<Person> people) {
        this.people = people;
    }

    public void getPeople() {
        for (Person p: people) {
            p.doWork();
        }
    }
}
