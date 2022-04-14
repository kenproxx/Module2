package Quiz;

public class QuanLySinhVien implements QuanLy<Student> {
    private Student[] listStudent = new Student[5];
    private int count = 0;

    @Override
    public void add(Student student) {
        listStudent[count] = student;
        count++;
    }

    @Override
    public void edit(String name, Student student) {
        listStudent[search(name)] = student;
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getName() == name) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(listStudent[i]);
        }
        System.out.println("-------------------------------");
    }

}

class TestQuiz {
    public static void main(String[] args) {
        Student std1 = new Student("kien", 1, 18, 10);
        Student std2 = new Student("nhung", 2, 17, 8);
        Student std3 = new Student("luyen", 3, 16, 6);
        Student std4 = new Student("thao", 4, 15, 7);
        Student std5 = new Student("giang", 5, 14, 9);

        QuanLySinhVien ql = new QuanLySinhVien();
        ql.add(std1);
        ql.add(std2);
        ql.add(std3);
        ql.add(std4);
        ql.display();
        System.out.println(ql.search("luyen"));
        ql.edit("nhung" , std5);
        ql.display();

    }
}
