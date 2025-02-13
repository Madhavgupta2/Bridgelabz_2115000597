class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    Ticket head;
    Ticket tail;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket booked successfully for " + customerName + " (" + movieName + ")");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head;
        Ticket previous = null;

        do {
            if (current.ticketID == ticketID) {
                if (previous == null) {
                    // Removing the first node (head)
                    if (head == head.next) {
                        head = tail = null; // Only one ticket
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                System.out.println("Ticket ID " + ticketID + " has been removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat Number: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchQuery) {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchQuery) || current.movieName.equalsIgnoreCase(searchQuery)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat Number: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for \"" + searchQuery + "\".");
        }
    }

    // Calculate the total number of booked tickets
    public void calculateTotalTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total number of booked tickets: " + count);
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Alice", "Inception", 5, "2025-02-11 10:00");
        system.addTicket(2, "Bob", "Titanic", 10, "2025-02-11 12:00");
        system.addTicket(3, "Charlie", "Avatar", 15, "2025-02-11 14:00");

        system.displayTickets();

        system.searchTicket("Inception");
        system.searchTicket("Titanic");
        system.searchTicket("Matrix");

        system.calculateTotalTickets();

        system.removeTicket(2);
        system.displayTickets();

        system.calculateTotalTickets();
    }
}
