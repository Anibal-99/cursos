public class Car {
    String nombre;
    Integer id;
    Account driver;
    Integer passenger;
    String license;

    public Car(Account driver) {
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("Driver " + driver.name);
    }
}
