package VehicleManagementSystem.vechicle;

public class Bike extends Vehicle {
private String seats;

public Bike(String brand, String model, String year, String seats) {
super(brand, model, year); // super kayword use to call parameters from

this.seats = seats;
}

@Override
public void displayData() {
System.out.println("Bike Deatails");
System.out.println(":Barand" + brand);
System.out.println("Model" + model);
System.out.println("Year" + year);
System.out.println("Seats:" + seats);
}
}