public class Ship extends Vehicle {
    String port = "Sevastopol Port, Ukraine";
    int passenger = 300;
    public Ship (int price, int speed, int age) {
        super (price, speed, age);
        this.coordinates = port;
    }
    //override and expanded method form Base class
    @Override
    public void info() {
        System.out.println("\nShip = ");
        super.info();
        System.out.println("Passengers: " + passenger + "\n" + "Coordinates: " + coordinates);
    }
}
