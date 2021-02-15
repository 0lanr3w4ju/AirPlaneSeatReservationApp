public class SeatReservationApp {

    private final String[][] seats = new String[6][6]; // Airplane with 36 sits (6 x 6)

    private int row = 0;
    private int column = 0;

    public void addPassengerDetailsToSeat(String passengerDetails, WaitingList waitingList) {
        if (seats[row][column] == null) { // if seat is empty
            seats[row][column] = passengerDetails; // allocate passenger details to seat
            System.out.println("Saved!");
        } else { // else if seat is not empty
            if (column < 5) { // check if column current number is lesser than five(5)
                column++; // if true, move to the next seat
                if (seats[row][column] == null) { // if seat is empty
                    seats[row][column] = passengerDetails; // allocate passenger details to seat
                    System.out.println("Saved!");
                }
            } else { // else if column is equals five(5)
                if (row < 5) { // check if row current row number is lesser than five(5)
                    row++; // if true, move to next seat row
                    column = 0; // and start from the first seat on new row
                    if (seats[row][column] == null) { // if seat is empty
                        seats[row][column] = passengerDetails; // allocate passenger details to seat
                        System.out.println("Saved!");
                    }
                } else { // else if row is equals five(5)
                    System.out.println("All Seats on Plane are Booked..");
                    System.out.println("You will be added on to the Wait List for the next Flight.\n" +
                            "Thank You..");
                    waitingList.addPassengerToWaitList(passengerDetails); // add passenger details to wait list
                }
            }
        }
    }

    public void removePassengerDetailsFromSeat(int row, int column) {
        if (row >= 0 && row <= 5) { // if row is between zero(0) and five(5)
            if (column >= 0 && column <= 5) { // and if column is between zero(0) and five(5)
                if (seats[row][column] != null) { // and if specified seat is allocated to a Passenger Details
                    System.out.printf("%s has been successfully deleted%n", seats[row][column]);
                    seats[row][column] = null; // Delete it
                } else System.out.println("Sorry! no passenger details Here");
            }
        }
    }

    public void addPassengerFromWaitListToSeat(WaitingList waitingList) {
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                if (seats[row][column] == null) { // if specified seat is not allocated
                    if (!waitingList.checkIfWaitListIsEmpty()) { // and if the wait list is not empty
                        seats[row][column] = waitingList.getNextPassengerOnWaitList(); // allocate first in line passenger details in wait list to vacant seat
                    }
                }
            }
        }
    }

    public void displayAvailableSeats() {
        int count = 0;
        for (String[] seat : seats) {
            for (String name : seat) {
                if (name == null) {
                    count++;
                }
            }
        }
        System.out.printf("/NEWS/: We currently have (%d) available seat(s) at (80)percent discount Per Seat Right-Now!%n", count);
    }

    public void listPassengersWithReservation() {
        for (String[] seat : seats) {
            for (String details : seat) {
                if (details != null) {
                    System.out.println(details);
                }
            }
        }
    }

}
