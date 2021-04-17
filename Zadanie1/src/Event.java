public class Event {
    private String name = "Epickie wydarzenie";
    private int participants = 0;
    private double budget = 0.0;
    private String organizer = "Epicki organizator";
    private boolean tickets = false;
    private boolean repetitive = false;

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
        return "[name of the event:" + getName() + ", number of participants: " + getParticipants() +
                ", event budget: " + getBudget() + ", organizer of the event: " + getOrganizer() +
                ", are tickets available: " + isTickets() + ", is the event repetitive: " + isRepetitive() +"]";
    }

    public void ticketsAvailable() {
        setTickets(true);
        System.out.println("Tickets for " + getName() + " are now available!");
    }

    public void ticketsUnavailable() {
        setTickets(false);
        System.out.println("Tickets for " + getName() + " are now unavailable!");
    }

    public void addToBudget(double extra) {
        double oldBudget = getBudget();
        setBudget(getBudget() + extra);
        System.out.println("Old budget was: " + oldBudget + "\n" + "New budget is: " + getBudget());
    }

}