public class Vehicle {
    protected String coordinates;
    protected int price;
    protected int speed;
    protected int age;

    public Vehicle(int price, int speed, int age) {
        this.price = price;
        this.speed = speed;
        this.age = age;
    }

    public void info() {
        System.out.println("Price: " + price + "\n" + "Speed: " + speed + "\n" + "Age: " + age);
    }

}

