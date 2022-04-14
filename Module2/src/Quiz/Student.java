package Quiz;

public class Student extends Person{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int id, int age, int score) {
        super(name, id, age);
        this.score = score;
    }

    public String toString() {
        return "id: " + getId() + ", ten: " + getName() + ", tuoi: " + getAge() + ", diem: " + getScore();
    }
}
