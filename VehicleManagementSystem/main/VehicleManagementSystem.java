package VehicleManagementSystem.main;

import VehicleManagementSystem.vechicle.Bike;
import VehicleManagementSystem.vechicle.Car;
import VehicleManagementSystem.vechicle.Truck;
import VehicleManagementSystem.vechicle.Vehicle;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("BMW", "Imola Red", "1990", "White"),
            new Bike("Honda", "Simple", "2018", "2"),
            new Truck("TATA", "def", "1990", "8")
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayData();
            System.out.println();
        }
    }
}