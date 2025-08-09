public class Bike extends Vehicles implements Speed {

    private String type;//mountain,road bike
    private boolean isElectric;

    public Bike(String vehicleID, String brand, int model, String color, String type, boolean isElectric) {
        super(vehicleID, brand, model, color);
        this.type = type;
        this.isElectric = isElectric;
        while (true) {
            if (!getBrand().equals("BMW") &&! getBrand().equals("Toyota")) {

                System.out.println("this brand is not available\n BMW or Toyota is available brand");
                setAv(false);
            }

            if (getModel() < 2019 || getModel() > 2022) {

                System.out.println("this model isn't available\n 2019->2022 is available");
                setAv(false);
            }

            if (!getColor().equals("black") && !getColor().equals("blue") &&!getColor().equals("white")) {
                System.out.println("the color isn't available \n black ,blue or white is the available color of this model");
                setAv(false);
            }
            if (!type.equals("mountain") &&!type.equals("road")) {

                System.out.println("this type isn't available\n just mountain or road");
                setAv(false);
            }
            if (isAvailable(isAv()) == true) {
                System.out.println("the bike is available in our store with the specifications: ");
                displayDetails();
                CalculateSpeed();
                break;
            }else{
                System.out.println("try again");
                break;
            }


        }
    }



    @Override
    void displayDetails() {
        System.out.println(toString()+toString2());

    }

    @Override
    boolean isAvailable(boolean b) {
        return b;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String toString2() {
        return "Bike{" +
                "isElectric=" + isElectric +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void CalculateSpeed() {
        System.out.println("the Speed of the bike is between 80->120");

    }


}
