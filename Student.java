package Student;

public class Student {

    // class attrributes
    String name;
    int age;
    String fullName;
    String fristName;
    String emailAddress;

    // ham tao: contructor
    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // class method
    void learnJava() {
        System.out.println("Learn Java with Youtube");
    }

    int getAge() {
        return 25;
    }
}
