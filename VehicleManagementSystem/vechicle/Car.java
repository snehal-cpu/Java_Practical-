package VehicleManagementSystem.vechicle;

public class Car extends Vehicle {
private String color;

public Car(String brand, String model, String year, String color) {
super(brand, model, year); // super kayword use to call parameters from

this.color = color;
}
@Override
public void displayData() {
System.out.println("Car Deatails");
System.out.println(":Barand" + brand);
System.out.println("Model" + model);
System.out.println("Year" + year);
System.out.println("Color:" + color);
}
}