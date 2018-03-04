import java.util.List;

public class StatsCalculator {


    private final List<Person> persons;

    public StatsCalculator(List<Person> persons) {
        this.persons = persons;
    }

    public void printSheet(){
        persons.forEach(person -> {
            System.out.println("Name: " + person.getName() + "\tAge: " + person.getAge() +  "\tMarks: "+person.marks);
        });
    }

    public void printClassResult() {
        int passCount = calculatePassStudents(persons);
        int failCount = calculateFailStudents(persons);

        System.out.println("Pass: " + passCount + "\nFail: " + failCount);
    }


    private int calculateFailStudents(List<Person> persons) {
        return (int) persons.stream().filter(person -> person.marks < 50).count();
    }

    private int calculatePassStudents(List<Person> persons) {
        int counter = 0;
        for (Person person : persons) {
            if(person.marks >= 50)
                counter ++;
        }
        return counter;
    }
}
