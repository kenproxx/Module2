package OOP;

public class Animal {
    private String food;
    private int hunger;
    private int boundaries;
    private int location;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(int boundaries) {
        this.boundaries = boundaries;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String makeNoise(String keu) {
        return keu;
    }



}

class ahihi {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setFood("meat");
        System.out.println(lion.getFood());
    }
}
