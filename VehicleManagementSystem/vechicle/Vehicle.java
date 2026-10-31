package VehicleManagementSystem.vechicle;
public abstract class Vehicle {
protected String brand;
protected String model;
protected String year;

public Vehicle(String brand, String model, String year) {

this.brand = brand;
this.model = model;
this.year = year;
}

// Abstact method

public abstract void displayData();
}