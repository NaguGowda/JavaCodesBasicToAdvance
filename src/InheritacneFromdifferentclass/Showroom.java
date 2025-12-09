package InheritacneFromdifferentclass;

import java.util.ArrayList;

public class Showroom {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();

        // Adding parent class objects
        carList.add(new Car("Honda", "City", 2020));
        carList.add(new Car("Toyota", "Fortuner", 2022));

        // Adding child class objects (SportsCar IS-A Car)
        carList.add(new SportsCar("Ferrari", "488", 2021, 330));
        carList.add(new SportsCar("Lamborghini", "Huracan", 2022, 325));

        // Displaying cars
        System.out.println("Cars in Showroom:");
        for (Car c : carList) {
            c.displayInfo(); // polymorphism → child method runs automatically
        }
    }
}
