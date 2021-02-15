import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengersDetailsAppTest {

    @Test
    void addPassengerDetails() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Pit", "Arrow", "Ac");
        assertEquals(passengersDetailsApp.getPassengerDetails(),passengersDetailsApp.getPassengerDetails());
    }

    @Test
    void getPassengerDetailWithKey() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Pit", "Arrow", "Ac");
        assertEquals("Pit".toUpperCase(), passengersDetailsApp.getPassengerDetailWithKey("First Name"));
    }

    @Test
    void getPassengerDetails() {
        PassengersDetailsApp passengersDetailsApp = new PassengersDetailsApp();
        passengersDetailsApp.addPassengerDetails("Pit", "Arrow", "Ac");
        assertEquals(passengersDetailsApp.getPassengerDetails(), passengersDetailsApp.getPassengerDetails());
    }
}