package OOP;

import java.util.Date;

public class StopWatch {
    private String startTime = String.valueOf(new Date());
    private String endTime = String.valueOf(new Date());
    public String nowTime() {
        return startTime;
    }
    public static void main(String[] args) {
        StopWatch nowTime = new StopWatch();

        System.out.println(nowTime);
    }
}
