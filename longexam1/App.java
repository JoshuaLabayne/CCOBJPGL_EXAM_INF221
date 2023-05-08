import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Tondo = new Tondo();
        Locations Boracay = new Boracay();
        Locations Hongkong = new Hongkong();
        Locations Palawan = new Palawan();
        Locations Africa = new Africa();
        Locations Russia = new Russia();

        Tourist Labayne = new Labayne();

        Boracay.accept(Labayne);
        Tondo.accept(Labayne);
        Hongkong.accept(Labayne);
        Palawan.accept(Labayne);
        Africa.accept(Labayne);
        Russia.accept(Labayne);



    }
}