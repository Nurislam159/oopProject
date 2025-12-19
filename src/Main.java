public class Main {
    public static void main(String[] args) {
        Car car = new Car(4.5, 1500, 1.6, "Toyota");
        Truck truck = new Truck(8.0, 7000, 3.5, "Construction");
        car.toMove();
        truck.toMove();
    }
}