// This still is not the complete program as asked in the practice paper, but it is acceptable  
// as the complete program could be lengthy

import java.util.Scanner;


class Reservations{
    int flights=2;
    int hotels=2;
    void flights_search(){
        if (flights != 0){
            System.out.println("Flights are available: "+flights);
        }
        else{
            System.out.println("Flights are not available.");
        }
    }
    void hotels_search(){
        if (hotels != 0){
            System.out.println("Hotels are available: "+flights);
        }
        else{
            System.out.println("Hotels are not available.");
        }
    }


}


public class flight_reservations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Reserve a flight: ");
        int f = sc.nextInt();

        Scanner vc = new Scanner(System.in);
        System.out.println("Reserve a hotel: ");
        int h = vc.nextInt();

        Reservations obj = new Reservations();
        obj.flights_search();
        obj.hotels_search();


        if (obj.flights>=0 && f<= obj.flights){
            System.out.println("Booked a flight");
        }
        else{
            System.out.println("Terminated flight booking.");
        }
        if (obj.hotels>=0 && h<=obj.hotels){
            System.out.println("Booked a hotel.");
        }
        else {
            System.out.println("Terminated hotel booking");
        }
    }
}
