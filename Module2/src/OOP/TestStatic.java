package OOP;

public class TestStatic {
    public static void main(String[] args) {
        Student s1 = new Student(1, "kien");
        Student s2 = new Student(2, "hue");
        s2.display();
        s1.display();
    }
}

class Student {
    private int rollno;
    private String name;
    private static String college = "BTDDL";
    Student(int x, String name) {
        rollno = x;
        this.name = name;
    }

    static void change() {
        college = "codegym";

    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}


