import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner lol =new Scanner(System.in);
        System.out.println("Hallo We are a Vehicle company for transporting vehicles ");
        System.out.println("the available brand: BMW,Toyota\n the available Colors: black,blue,white\nthe available model: 2019->2022 ");
        while (true){
            System.out.println("what are you looking for (cars,bikes,trucks)");
            String lookingFor=lol.next();

        if (lookingFor.equals("cars")){
            System.out.println("Enter the Car specifications \n (VehicleID,brand,model,Color,numSeats)");
            String VehicleID=lol.next();
            String brand=lol.next();
            int model = lol.nextInt();
            String Color=lol.next();
            int numSeats = lol.nextInt();

            Cars c=new Cars(VehicleID,brand,model,Color,numSeats);
            if (c.isAv()==false){
                continue;
            }else if (c.isAv()==true){
                break;
            }

        }
        else if(lookingFor.equals("bikes")){
            System.out.println("Enter the Car specifications \n (VehicleID,brand,model,Color,type,isElectric(true,false))");
            String VehicleID=lol.next();
            String brand=lol.next();
            int model = lol.nextInt();
            String Color=lol.next();
            String type = lol.next();
            boolean isElectric= lol.nextBoolean();

            Bike b=new Bike(VehicleID,brand, model,Color,type,isElectric);
            if (b.isAv()==false){
                continue;
            }else if (b.isAv()==true){
                break;
            }
        }else if (lookingFor.equals("trucks")){
            System.out.println("Enter the trucks specifications \n (VehicleID,brand,model,Color,numSeats)");
            String VehicleID=lol.next();
            String brand=lol.next();
            int model = lol.nextInt();
            String Color=lol.next();
            int numSeats = lol.nextInt();

            Truck t=new Truck(VehicleID,brand,model,Color,numSeats);
            if (t.isAv()==false){
                continue;
            }else if (t.isAv()==true){
                break;
            }
        }else{
            System.out.println("i don't understand,please try again ");
        }

      }
    }
}