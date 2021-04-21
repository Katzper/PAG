import java.util.ArrayList;
import java.util.Objects;

public class Concert extends Event{

    private String place;

    public Concert(String name, int participants, double budget, String organizer, boolean tickets, boolean repetitive, String place) {
        super(name, participants, budget, organizer, tickets, repetitive);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    private ArrayList<String> Artists = new ArrayList<>();

    public void addArtist(String Artist) {
        Artists.add(Artist);
    }

    public int artistsPerforming() {
        return Artists.size();
    }

    public String toString() {
        return "[name of the concert:" + getName() + "\n" +
                "taking place in: " + getPlace() + "\n" +
                "number of participants: " + getParticipants() + "\n" +
                "concert budget: " + getBudget() + "\n" +
                "organizer of the event: " + getOrganizer() + "\n" +
                "are tickets available: " + isTickets() +  "\n" +
                "is the event repetitive: " + isRepetitive() + "\n" +
                "artists performing: " + artistsPerforming() + "\n" +
                "all the artists: " + Artists +
                 "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Concert concert = (Concert) o;
        return Objects.equals(place, concert.place) && Objects.equals(Artists, concert.Artists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place, Artists);
    }
}
