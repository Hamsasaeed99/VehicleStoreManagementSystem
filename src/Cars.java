public class Cars extends Vehicles implements Speed {
    private int numSeats;


    public Cars(String vehcleID, String brand, int model, String color, int numSeats) {
        super(vehcleID, brand, model, color);
        this.numSeats = numSeats;
        while (true){

        if (!getBrand().equals("BMW")&&!getBrand().equals("Toyota")) {
            System.out.println("this brand is not available\n BMW or Toyota is available brand");
            setAv(false);
        }
        if(getModel()<2019||getModel()>2022){

            System.out.println("this model isn't available\n 2019->2022 is available");
            setAv(false);
        }
        if((numSeats<2)||(numSeats>14)){
            System.out.println("the smallest number of seats is 7 and the biggest number of seats is 14");
            setAv(false);
        }

        if (!getColor().equals("black")&&!getColor().equals("blue")&&!getColor().equals("white")){
            System.out.println("the color isn't available \n black ,blue or white is the available color of this model");
            setAv(false);

        }
        if (isAvailable(isAv())==true){
            System.out.println("the car is available in our store with the specifications: ");
            displayDetails();
            CalculateSpeed();
            break;
        }else {
            System.out.println("try again");
            break;
        }



    }}


    @Override
    void displayDetails(){
        System.out.println(toString()+toString3());
    }

    @Override
    boolean isAvailable(boolean b) {
       return b;

    }



    public String toString3() {
        return "Cars{" +
                "numSeats=" + numSeats +
                '}';
    }

    @Override
    public void CalculateSpeed() {
        if(getModel()==2019){
            System.out.println("the Speed of the car is  between 160->200");
        }
        if(getModel()==2020){
            System.out.println("the Speed of the car is  between 200->250");
        }
        if(getModel()==2021){
            System.out.println("the Speed of the car is  250->300");
        }
        if(getModel()==2022){
            System.out.println("the Speed of the car is  200->400");
        }

    }


}
