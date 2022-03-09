import java.util.ArrayList;
import java.util.Arrays;

public class PersonList {
    static ArrayList<Person> personArray = new ArrayList<Person>();

    public void postPerson(Person newPerson) {
        personArray.add(newPerson);
    }

    public Person getPersonUsingID(int id) {
        Person findPerson = new Person();
        for (Person person : personArray) {
            if (person.getId() == id) {
                findPerson = person;
            }
        }
        return findPerson;
    }

    public ArrayList<Person> getAllPersons() {
        return personArray;
    }

    public void updatePerson(Person updatePerson) {
        Person findPerson = new Person();
        for (Person person : personArray) {
            if (person.getId() == updatePerson.getId()) {
                findPerson = person;
            }
        }
        findPerson.setName(updatePerson.getName());
        findPerson.setAge(updatePerson.getAge());
        findPerson.setCity(updatePerson.getCity());
    }

    public void deletePersonUSINGID(int id) {
        int index = -1;
        for (int i = 0; i < personArray.size(); i++) {
            if (personArray.get(i).getId() == id) {
                index = i;
            }
        }
        personArray.remove(index);
    }
}
