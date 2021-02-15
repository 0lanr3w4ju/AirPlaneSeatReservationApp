import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaitingListTest {

    @Test
    void addPassengerToWaitList() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();
        SeatReservationApp seatReservationApp = new SeatReservationApp();
        passengersDetailsApp.addPassengerDetails("Chibuzor", "Slim", "NJ");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        assertFalse(waitingList.checkIfWaitListIsEmpty());
    }

    @Test
    void getNextPassengerOnWaitList() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();
        passengersDetailsApp.addPassengerDetails("Seyi", "Fast", "CA");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        waitingList.getNextPassengerOnWaitList();
        assertTrue(waitingList.checkIfWaitListIsEmpty());
    }

    @Test
    void checkIfWaitListIsEmpty() {
        WaitingList waitingList = new WaitingList();
        assertTrue(waitingList.checkIfWaitListIsEmpty());
    }

    @Test
    void testToString() {
        WaitingList waitingList = new WaitingList();
        assertNotNull(waitingList.toString());
    }
}