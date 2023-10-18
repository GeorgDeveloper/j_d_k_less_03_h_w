package task_04;

import java.util.ArrayList;

public class Club {
    private ArrayList<Person> people;

    public Club(ArrayList<Person> people) {
        this.people = people;
    }

    public void getPeople() {
        for (Person p: people) {
            p.haveRest();
        }
    }
}
