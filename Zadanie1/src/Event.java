import java.util.Objects;

public class Event {
    private String name;
    private int participants;
    private double budget;
    private String organizer;
    private boolean tickets;
    private boolean repetitive;

    public Event(String name, int participants, double budget, String organizer, boolean tickets, boolean repetitive) {
        this.name = name;
        this.participants = participants;
        this.budget = budget;
        this.organizer = organizer;
        this.tickets = tickets;
        this.repetitive = repetitive;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setParticipants(int participants) {
        this.participants = participants;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
    public void setTickets(boolean tickets) {
        this.tickets = tickets;
    }
    public void setRepetitive(boolean repetitive) {
        this.repetitive = repetitive;
    }

    public String getName(){
        return name;
    }
    public int getParticipants() {
        return participants;
    }
    public double getBudget() {
        return budget;
    }
    public String getOrganizer() {
        return organizer;
    }
    public boolean isTickets() {
        return tickets;
    }
    public boolean isRepetitive() {
        return repetitive;
    }

    public String toString() {
        return "[name of the event:" + getName() + "\n" +
                "number of participants: " + getParticipants() + "\n" +
                "event budget: " + getBudget() + "\n" +
                "organizer of the event: " + getOrganizer() + "\n" +
                "are tickets available: " + isTickets() + "\n" +
                "is the event repetitive: " + isRepetitive() +"]";
    }

    public void ticketsAvailable() {
        setTickets(true);
        System.out.println("Tickets for " + getName() + " are now available!");
    }

    public void ticketsUnavailable() {
        setTickets(false);
        System.out.println("Tickets for " + getName() + " are now unavailable!");
    }

    /**
     * metoda zwracająca budżet powiększony o ustaloną wartość
     * @param extra
     * @returns newbudget
     */
    public void addToBudget(double extra) {
        double oldBudget = getBudget();
        setBudget(getBudget() + extra);
        System.out.println("Old budget was: " + oldBudget + "\n" + "New budget is: " + getBudget());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return participants == event.participants && Double.compare(event.budget, budget) == 0 && tickets == event.tickets && repetitive == event.repetitive && name.equals(event.name) && Objects.equals(organizer, event.organizer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, participants, budget, organizer, tickets, repetitive);
    }
}