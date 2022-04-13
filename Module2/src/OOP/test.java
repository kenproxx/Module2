package OOP;

import java.util.Date;

public class test {
    public static void main(String[] args) {
       String nowTime= String.valueOf(new Date());
        System.out.println(nowTime);
    }

}
class hiHa extends Fan {

    public hiHa(int speed, int so, double radius, String color) {
        super(speed, so, radius, color);
    }


}

