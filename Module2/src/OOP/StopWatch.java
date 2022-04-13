package OOP;


import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
 class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhấn 'y' để bắt đầu: ");
        char y = sc.next().charAt(0);
        if (y == 'y') {
            sw.setStartTime();
            System.out.println("Thời gian bắt đầu: " + sw.getStartTime());
            System.out.print("Nhấn 'n' để bắt đầu: ");
            char n = sc.next().charAt(0);
            if (n == 'n') {
                sw.stop();
                System.out.println("Thời gian kết thúc: " + sw.getEndTime());
                System.out.println("Thời gian đã qua: " + sw.getElapsedTime());
            }
        }
    }
}
