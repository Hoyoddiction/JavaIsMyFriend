public class Cars {
    private String name;
    private int maxSpeed;
    private int yearOfManufacture;

    public Cars(String name, int maxSpeed, int yearOfManufacture) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void name() {
        System.out.println("name");
    }

    public void maxSpeed() {
        System.out.println("maxSpeed");
    }

    public void yearOfManufacture() {
        System.out.println("yearOfManufacture");
    }

    public static void CAR(String[] args) {
        Car myCar = new Car("AE86", 120, 1985);
        myCar.name();
        myCar.yearOfManufacture();
        myCar.maxSpeed();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
    }
    public static void main (String[] args) {
        Car myCar = new Car("AE86", 120, 1985);
        myCar.displayInfo();
    }
}
