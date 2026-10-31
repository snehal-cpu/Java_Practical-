import java.util.Scanner;
//Interface
interface ElecticityBill{
    double calculateBill();
}
//Custom exception
class InvalidUnitException extends Exception{
    public InvalidUnitException (String message){
        super(message);
    }
}

//Commercial customer Class
class CommercialCustomer implements ElecticityBill {
    private int units;

    CommercialCustomer(int units)throws InvalidUnitException{
    if(units<0){
        throw new InvalidUnitException(
            "Unit cannot be negative"
        );
    }
    this.units=units;
   }

    public double calculateBill() {
        return units*6.0;
    }
}


//main class.
public class ElectricityBillGenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println( "Enter Units for commercial customer:");
            int commercialUnit=sc.nextInt();


            //Creating an object commercial customer
            ElecticityBill commercial=new CommercialCustomer(commercialUnit);

            System.out.println("Commercial:"+commercial.calculateBill());
        }
        catch(InvalidUnitException e){
            System.out.println("Error:"+e.getMessage());
        }
        sc.close();
}
    }
    