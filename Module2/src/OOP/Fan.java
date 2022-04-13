package OOP;

public class Fan {
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,1,4,"red");
        Fan fan2 = new Fan(2,0,3,"green");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan1.equals(fan2));



    }
    public boolean equals(Fan hii) {
        if (color.equals(hii.color)) {
            return true;
        } else {
            return false;
        }

    }

    static void hihi() {

    }




    public Fan(int speed, int so, double radius, String color) {
        this.speed = speed;
        if (so == 1) {
            this.status = true;
        }
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int so) {
        speed = so;
    }

    public int getSpeed() {
        return speed;
    }

    public  boolean checkStatus() {
        return status;
    }

    public boolean setStatus(int so) {
        if (so == 1) {
            status = true;
        }
        return status;
    }

    public void setRadius(double sradius) {
         radius = sradius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String whatColor) {
         color = whatColor;
    }

    public String checkColor() {
        return color;
    }

    public String toString() {
        String str = "quat dang tat";
        if (checkStatus()) {
            str = "quat dang bat, toc do quay o muc " + this.getSpeed() + ", mau sac la " + this.checkColor() +
            ", ban kinh la " + this.getRadius();
        }

        return str;

    }

}


