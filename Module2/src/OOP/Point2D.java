package OOP;

public class Point2D {
    private float x = 0.0f, y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
         float[] xy = {this.x, this.y};
         return xy;
    }

    public String toString() {
        return this.x + "," + this.y;
    }

}

class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
         float[] getXYZ = {super.getX(), super.getY(), this.z};
         return getXYZ;
    }

    public String toString() {
        return super.getX() + ", " + super.getY() + ", " + this.z;
    }

}

class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,5);
        System.out.println(point2D);
        Point3D point3D = new Point3D(6, 9, 7);
        System.out.println(point3D);

        Point3D test1 = (Point3D) new Point2D(4,7);
        System.out.println(test1);
    }
}
