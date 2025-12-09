package InheritacneFromdifferentclass;

public class SportsCar extends Car {

    public int topSpeed;

    public SportsCar(String brand, String model, int year, int topSpeed) {
        super(brand, model, year);   // accessing parent properties
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model + " | Top Speed: " + topSpeed + " km/h");
    }
}
