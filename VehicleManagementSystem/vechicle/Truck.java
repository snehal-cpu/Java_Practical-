package VehicleManagementSystem.vechicle;

public class Truck extends Vehicle {
private String wheels;

public Truck(String brand, String model, String year, String wheels) {
super(brand, model, year); // super kayword use to call parameters from

this.wheels = wheels;
}

@Override

public void displayData() {
System.out.println("Truck Deatails");
System.out.println(":Barand" + brand);
System.out.println("Model" + model);
System.out.println("Year" + year);
System.out.println("No of wheels:" + wheels);

}
}