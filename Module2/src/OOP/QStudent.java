package OOP;

public class QStudent {
    private String name = "john", classes = "c02";

    public QStudent() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "QStudent{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

class RunStudent {
    public static void main(String[] args) {
        QStudent student1 = new QStudent();
        QStudent student2 = new QStudent();
        student1.setName("kien");
        student1.setClasses("c0222h1");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
