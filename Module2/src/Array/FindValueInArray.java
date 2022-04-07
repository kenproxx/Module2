package Array;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"kien", "tue", "phong", "hoang", "tin"};
        System.out.println("you want find name student?");
        String nameStudent = scanner.nextLine();
        String result = "co cl y ma tim";
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {
                result = "no o vi tri " + i;
            }
        }
        System.out.println(result);
    }
}
