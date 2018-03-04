public class Person {

    private String name;
    private String age;
    protected int marks;

    Person(){

    }

    Person(String name, String age) {
        this.name = name;
        this.age = age;
    }


    void greet(){
        System.out.println("Hello " + name + ". Welcome! We know that your age is: " + age);
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
