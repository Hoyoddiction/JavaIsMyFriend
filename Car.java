import javax.xml.namespace.QName;

public class Car {
    private String name;
    private int maxSpeed;
    private int yearOfManufacture;
    public Car(String name, int maxSpeed, int yearOfManufacture) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void name(){
        System.out.println("name" + name);
    }
    public void maxSpeed(){
        System.out.println("maxSpeed" + maxSpeed +"mph");
    }
    public void yearOfManufacture(){
        System.out.println("yearOfManufacture" + yearOfManufacture);
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + "mph");
        System.out.println("Year of Manufacture: " + yearOfManufacture);
    }

    public static void main (String[] args) {
        Car myCar = new Car("AE86", 125, 1985);
        myCar.displayInfo();
    }
}