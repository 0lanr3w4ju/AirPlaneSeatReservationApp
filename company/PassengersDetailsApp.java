import java.util.HashMap;
import java.util.Random;

public class PassengersDetailsApp {

    private HashMap<Object, Object> passenger; // hashmap declaration

    public void addPassengerDetails(String firstName, String lastName, String destination) {
        passenger = new HashMap<>();

        passenger.put("First Name", firstName.toUpperCase());
        passenger.put("Last Name", lastName.toUpperCase());
        passenger.put("Destination", destination.toUpperCase());
        passenger.put("Identity", generateRandomToken());
    }

    private int generateRandomToken() {
        Random token = new Random();
        int upperbound = 1001;
        return token.nextInt(upperbound);
    }

    Object getPassengerDetailWithKey(String key) { // get passenger details with key
        return passenger.get(key); //////RF///-////0////////////////////
    }
    
    public String getPassengerDetails() {
         return
        "[Identity: "+getPassengerDetailWithKey("Identity")+"], " +
        "[First Name: "+getPassengerDetailWithKey("First Name")+"], " +
        "[Last Name: "+getPassengerDetailWithKey("Last Name")+"], " +
        "[Destination: "+getPassengerDetailWithKey("Destination")+"],\n";
    }

}
