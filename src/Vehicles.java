public abstract class Vehicles {
    private String VehicleID;
    private String brand;
    private int model;
    private  String Color;
    private boolean av=true;

    abstract void displayDetails();
    abstract boolean isAvailable(boolean b);




    public Vehicles(String vehicleID, String brand, int model, String color) {
        VehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        Color = color;
    }

    public boolean isAv() {
        return av;
    }

    public void setAv(boolean av) {
        this.av = av;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(String vehicleID) {
        VehicleID = vehicleID;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "VehicleID='" + VehicleID + '\'' +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", Color='" + Color + '\'' +
                ", av=" + av +
                '}';
    }
}
