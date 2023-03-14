package Airplane;

public class Seat extends Aircraft {

    boolean reserved = true;

    String seatPlace = Integer.toString(rows) + seats;

    public Seat(int rows, char seats) {
        super(rows, seats);
    }

    /**
     * printing all seats
     */

    public void printSeat(){
        System.out.println(seatPlace);
    }

    /**
     * checking if any seat is reserved
     */

    public void checkReserve(){
        if(reserved){
            System.out.println("Seat" +seatPlace + "is already reserved");
        }
        System.out.println("Seat" + seatPlace + "is free");
    }

    public void bookReserved(String seatPlace){
        this.seatPlace = seatPlace;
        if (reserved){

        }
    }

}
