public class Plane extends Vehicle {
    String altitude = "35000 ft above sea level";
    int passenger = 100;

    public Plane(int price, int speed, int age) {
        super(price, speed, age);
        this.coordinates = altitude;
    }
    @Override
    public void info() {
        System.out.println("\nPlane = ");
        super.info();
        System.out.println("Passengers: " + passenger + "\n" + "Coordinates: " + coordinates);
    }
}
