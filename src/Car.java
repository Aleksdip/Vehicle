public class Car extends Vehicle {
    public Car(int price, int speed, int age) {
        super(price, speed, age);
    }
    @Override
    public void info() {
        System.out.println("Car = ");
        super.info();

    }
}
