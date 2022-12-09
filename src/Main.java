public class Main {
    public static void main(String[] args) {
        Car car = new Car (30000, 220,5);
        car.info();
        Ship ship = new Ship(250000, 100, 3);
        ship.info();
        Plane plane = new Plane(30000000, 800, 10);
        plane.info();

    }
}