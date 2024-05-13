/**
 * Short, one-line description of Ticket class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Rose McCormack) 
 * @version (9 April 2024)
 */
public class Ticket
{
    private Customer customer;
    private Flight flight;
    /**
     * @param customer This parameter in the Ticket() constructor will allow
     * us to set a customer object within the ticket object.
     * 
     * @param flight This object in the Ticket() constructor will allow us 
     * to set a flight object within the ticket object.
     */
    public Ticket(Customer customer, Flight flight) 
    {
        this.customer = new Customer(customer);
        this.flight = flight.copy();
    }
    /**
     * @param customer This mutator will allow the user to set the customer
     * object within the ticket class.
     */
    public void setCustomer(Customer customer) 
    {
        this.customer = new Customer(customer);
    }
    /**
     * @param flight This mutator will allow the user to set the flight
     * object within the ticket class.
     */
    public void setFlight(Flight flight) 
    {
        this.flight = flight.copy();
    }
    /**
     * @return This accessor will allow the user to retrieve the customer
     * object within the ticket class.
     */
    public Customer getCustomer() 
    {
        return new Customer(customer);
    }
    /**
     * @return This accessor will allow the user to retrieve the flight
     * object within the ticket class.
     */
    public Flight getFlight() 
    {
        return flight.copy();
    }
    /**
     * @return This method will print a string relating to the ticket.
     */
    public String toString() 
    {
        return "******** TICKET ********\n" 
            + "* Name: " + customer.getName() + "\n" 
            + "* SSN: " + customer.getSsn() + "\n" 
            + "* Flight: " + flight.getFlightNumber() + "\n" 
            + "* Date: " + flight.getDate() + "\n" 
            + "* Destination: " + flight.getDestination() + "\n" 
            + "************************\n";
    }
}
