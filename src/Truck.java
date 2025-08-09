public class Truck extends Vehicles implements Speed {
    private int numSeats;
    private int LoadCapacity;


    public Truck(String vehicleID, String brand, int model, String color, int numSeats) {
        super(vehicleID, brand, model, color);
        this.numSeats = numSeats;
        while (true) {

            if (!getBrand().equals("BMW") && !getBrand().equals("Toyota")) {
                System.out.println("this brand is not available\n BMW or Toyota is available brand");
                setAv(false);
            }

            if (getModel() < 2019 || getModel() > 2022) {

                System.out.println("this model isn't available\n 2019->2022 is available");
                setAv(false);
            }
            if (numSeats != 3) {
                System.out.println("the available number of seats is 3 ");
                setAv(false);
            }

            if (!getColor().equals("black") && !getColor().equals("blue") && !getColor().equals("white")) {
                System.out.println("the color isn't available \n black ,blue or white is the available color of this model");
                setAv(false);
            }

            if (isAvailable(isAv()) == true) {
                System.out.println("the truck is available in our store with the specifications: ");
                displayDetails();
                CalculateSpeed();
                break;
            }else {
                System.out.println("try again");
                break;
            }
        }
    }


    @Override
    void displayDetails() {
        System.out.println(toString()+toString4());
    }

    @Override
    boolean isAvailable(boolean b) {
        return b;
    }

    public int getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        LoadCapacity = loadCapacity;
    }



    public String toString4() {
        return "Truck{" +
                "numSeats=" + numSeats +
                ", LoadCapacity=" + LoadCapacity +
                '}';
    }

    @Override
    public void CalculateSpeed() {

        System.out.println("the Speed of the truck is between 90->160");
        System.out.println("the LoadCapacity of this truck is 26 Tons");

    }


}
