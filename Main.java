package Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Run");
        Student st1 = new Student(); // contructor

        Student st2 = new Student("Hai", 22);
        System.out.println("Check object: " + st2.name + " and age " + st2.age);
    }
}
