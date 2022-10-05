package Emirates;



public class Emirates_TC {

    private int businessClassSeats = 5;
    private int economyClassSeats = 20;

    public synchronized void bookTickets(String p_name,String ticketsCategory,int number_of_seats){
        if (ticketsCategory == "businessClass" ) {
            if (number_of_seats <= businessClassSeats && number_of_seats != 0) {
                System.out.println(p_name + " your " + number_of_seats + " business_class Seats booked successfully...");
                businessClassSeats -= number_of_seats;
            } else if (businessClassSeats == 0) {

                System.out.println("Sorry, " + p_name + " business_class seats are not available.");

            }
            else if (businessClassSeats < number_of_seats) {

                System.out.println("Oops, " + p_name + " there are only " + businessClassSeats + " seats available");

            }
            else {
                System.out.println("Invalid input");
            }
        }
        else if (ticketsCategory == "economyClass" ) {
            if (economyClassSeats >= number_of_seats && number_of_seats != 0) {
                System.out.println(p_name + " your " + number_of_seats + " economy_class Seats booked successfully...");
                economyClassSeats -= number_of_seats;
            } else if (economyClassSeats == 0) {

                System.out.println("Sorry, " + p_name + " economy_class seats are not available.");

            } else if (economyClassSeats < number_of_seats) {

                System.out.println("Oops, " + p_name + " there are only " + economyClassSeats + " seats available");

            }
            else {
                System.out.println("Invalid input");
            }
        }
            else {
                System.out.println("Invalid input");
            }

    }


}
