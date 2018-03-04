import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            Male male = getStudentInfo(scanner);

            persons.add(male);

            System.out.println("-----------");

            System.out.print("Any more students? (Y/N) ");
            String next = scanner.nextLine();
            if(next.toLowerCase().equals("n")){
                break;
            }
        }

        StatsCalculator calculator = new StatsCalculator(persons);
        calculator.printClassResult();

        System.out.println("Class count = " + persons.size());

        calculator.printSheet();

    }

    private static Male getStudentInfo(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        String age = scanner.nextLine();

        Male male = new Male(name, age);

        System.out.print("Enter student marks: ");
        male.marks = Integer.parseInt(scanner.nextLine());
        return male;
    }


}
