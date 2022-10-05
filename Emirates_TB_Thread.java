package Emirates;




public class Emirates_TB_Thread extends Thread {

    private Emirates_TC ticketCounter;

    private String passengerName;

    private String ticketsCategory;
    private int noOfSeatsToBook;


    public Emirates_TB_Thread(Emirates_TC ticketCounter, String passengerName,String ticketsCategory, int noOfSeatsToBook){
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.ticketsCategory = ticketsCategory;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }

    public void run(){
        ticketCounter.bookTickets(passengerName,ticketsCategory,noOfSeatsToBook);
    }


}
