import java.util.HashMap;

public class PassengersDetailsApp {

    private HashMap<String, String> passenger; // hashmap declaration

    public void addPassengerDetails(String firstName, String lastName, String destination) {
        passenger = new HashMap<>();

        passenger.put("First Name", firstName.toUpperCase());
        passenger.put("Last Name", lastName.toUpperCase());
        passenger.put("Destination", destination.toUpperCase());
    }

    public String getPassengerDetailWithKey(String key) { // get passenger details with key
        return passenger.get(key); //////RF///-////0////////////////////
    }

    public String getPassengerDetails() {
        return String.valueOf(passenger);
    }

}
