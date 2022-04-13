package OOP;

public class Point {
    private float x = 0.0f, y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] getXY = {this.x, this.y};
        return getXY;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x + ", " + this.y;
    }

}

class MovablePoint extends Point {
    private float xSpeed = 0.0f, ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y) {
        super.setX(x);
        super.setY(y);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super.setX(x);
        super.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {this.xSpeed, this.ySpeed};
        return getSpeed;
    }

    public String toString() {
        return super.getX() + ", " + super.getY() + "\n" +
                "speed = (" + this.getXSpeed() + ", " + this.getYSpeed() +")";
    }

    public MovablePoint Move() {
        setX(this.getX() + this.xSpeed);
        setY(this.getY() + this.ySpeed);
        return this;


    }
}

class MovableTest {
    public static void main(String[] args) {
        Point newPoint = new Point(3,6);
        System.out.println(newPoint.toString());
        MovablePoint newMove = new MovablePoint(5,5,5,5);
        System.out.println(newMove.getXSpeed());
        newMove.Move();
//        newMove.Move();
//        newMove.Move();
//        newMove.Move();
        System.out.println(newMove.toString());
    }
}
