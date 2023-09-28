//Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
// Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
// Перевантажити конструктори викликаючи конструктор із конструктора.
// Створити клас Main, де створити екземпляри класу Машина з різними параметрами.
package Task4_04;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println(car1.showInfo());
        Car car2=new Car(100.5);
        System.out.println(car2.showInfo());
        Car car3=new Car(2000, 120, "red");
        System.out.println(car3.showInfo());
        Car car4=new Car(2002, 100, 2000, "white");
        System.out.println(car4.showInfo());
    }
}
