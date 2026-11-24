package Java;

public class WrackyVehicle{
    String brand;
    int year;
    //Constructor with parameter
    public WrackyVehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public void ShowInfo(){
        System.out.println("Brand"+brand+"\nYear"+year);
    }
    public static void main(String[] args){
        WrackyVehicle car= new WrackyVehicle("Toyota",2020);
        car.ShowInfo();
    }
}