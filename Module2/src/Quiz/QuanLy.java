package Quiz;

public interface QuanLy<T> {
    void add(T t);
    void edit(String name, T t);
    int search(String name);
    void display();
}
