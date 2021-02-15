import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaitingListTest {

    @Test
    void addPassengerToWaitList() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();
        passengersDetailsApp.addPassengerDetails("Chibuzor", "Slim", "NJ");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        assertEquals("{Destination=NJ, First Name=CHIBUZOR, Last Name=SLIM}", waitingList.getNextPassengerOnWaitList());
    }

    @Test
    void getNextPassengerOnWaitList() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        WaitingList waitingList = new WaitingList();
        passengersDetailsApp.addPassengerDetails("Seyi", "fast", "CA");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        passengersDetailsApp.addPassengerDetails("Chibuzor", "Slim", "NJ");
        waitingList.addPassengerToWaitList(passengersDetailsApp.getPassengerDetails());
        assertEquals("{Destination=CA, First Name=SEYI, Last Name=FAST}", waitingList.getNextPassengerOnWaitList());
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