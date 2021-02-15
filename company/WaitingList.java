import java.util.LinkedList;

public class WaitingList {

    private final LinkedList<String> theWaitList = new LinkedList<>(); // linked list declaration

    public void addPassengerToWaitList(String passengerDetail) {
        theWaitList.addLast(passengerDetail); // append passenger detail to wait list
    }

    public String getNextPassengerOnWaitList() {
        return theWaitList.removeFirst(); // remove passenger detail that is first in line
    }

    public boolean checkIfWaitListIsEmpty() {
        return theWaitList.isEmpty(); // check wait list if empty or not
    }

    @Override
    public String toString() {
        return "Passengers on Wait List:\n" + theWaitList; // display passenger details on wait list
    }

}
