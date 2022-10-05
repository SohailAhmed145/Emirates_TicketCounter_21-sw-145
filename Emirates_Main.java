package Emirates;


public class Emirates_Main {
    public static void main(String[] args) throws InterruptedException {

        Emirates_TC ticketCounter = new Emirates_TC();


        Emirates_TB_Thread t1= new Emirates_TB_Thread(ticketCounter,"Ali","businessClass",3);
        Emirates_TB_Thread t2= new Emirates_TB_Thread(ticketCounter,"Hussain","businessClass",4);
        Emirates_TB_Thread t3 = new Emirates_TB_Thread(ticketCounter,"Khalique", "economyClass", 20);
        Emirates_TB_Thread t4 = new Emirates_TB_Thread(ticketCounter,"Hassan", "economyClass", 18);


        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();


    }
}
