package Task4_04;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year=1990;
        this.speed=100;
        this.weight=1900;
        this.color="pink";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(double speed) {
        // викликали конструктор із конструктора
        this(0, speed);
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Car(int year, double speed, String color) {
        // викликали конструктор із конструктора
        this(year, speed, 0, color);
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public String showInfo() {
        return "\nCar Info: " +
                "\nyear=" + year +
                ", \nspeed=" + speed +
                ", \nweight=" + weight +
                ", \ncolor='" + color + '\'';
    }
}
