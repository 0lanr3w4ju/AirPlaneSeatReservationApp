import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatReservationAppTest {

    @Test
    void addPassengerDetailsToSeat() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        WaitingList waitingList = new WaitingList();
        passengersDetailsApp.addPassengerDetails("Zeze", "OMG!", "NY");
        seatReservationApp.addPassengerDetailsToSeat(passengersDetailsApp.getPassengerDetails(), waitingList);
        seatReservationApp.removePassengerDetailsFromSeat(0,0);
    }

    @Test
    void removePassengerDetailsFromSeat() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        WaitingList waitingList = new WaitingList();
        passengersDetailsApp.addPassengerDetails("Debby","Smart", "TZ");
        seatReservationApp.addPassengerDetailsToSeat(passengersDetailsApp.getPassengerDetails(), waitingList);
        seatReservationApp.displayAvailableSeats(); //available seat before using the remove method
        seatReservationApp.removePassengerDetailsFromSeat(0,0); // the remove method
        seatReservationApp.displayAvailableSeats(); //available seat afte using the remove method
    }

    @Test
    void addPassengerFromWaitListToSeat() {
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();
        passengersDetailsApp.addPassengerDetails("Alex","alex", "AU");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        seatReservationApp.addPassengerFromWaitListToSeat(waitingList);
        seatReservationApp.displayAvailableSeats();
    }

    @Test
    void displayAvailableSeats() {
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        seatReservationApp.displayAvailableSeats();
    }
}