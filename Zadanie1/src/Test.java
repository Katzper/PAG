import java.util.Objects;

class Test {
    public static void main(String[] args) {
        Event Event1 = new Event("Event", 3, 4, "Organizator", false, false);
        Event Event2 = new Event("Event", 3, 4, "Organizator", false, false);
        Event Event3 = new Event("DifferentEvent", 100, 10000, "DifferentOrganizator", true, false);
        if (Event1.equals(Event2) && !Event1.equals(Event3)) {
            System.out.println("Equal tests passed" + "\n");
        }
        if (Event1.hashCode() == Event2.hashCode()) {
            System.out.println("Hashcode test passed" + "\n");
        }
        System.out.printf("%s%n", Event1);
        Concert Concert1 = new Concert("Juwenalia 2021", 34,221000, "Politechnika Warszawska", false, false, "Stadion Syrenki");
        Concert Concert2 = new Concert("Juwenalia 2021", 34,221000, "Politechnika Warszawska", false, false, "Stadion Syrenki");
        Concert Concert3 = new Concert("Juwenalia 2022", 34,21334.4, "Politechnika Warszawska", false, false, "Stadion Syrenki");
        if (Concert1.equals(Concert2) && !Concert2.equals(Concert3)) {
            System.out.println("Equal tests for concerts passed " + "\n");
        }
        Concert1.addArtist("Singer");
        Concert1.addArtist("Band");
        if (!Concert1.equals(Concert2) && !Concert2.equals(Concert3) && !Concert1.equals(Concert3)) {
            System.out.println("Equal tests for concerts passed " + "\n");
        }
        else {
            System.out.println("All the objects aren't equal");
            }
        Concert2.addArtist("Singer");
        Concert2.addArtist("Band");
        if (Concert1.equals(Concert2)) {
            System.out.println("Equal tests after adding the same artists passed" + "\n");
        }
        if (Concert1.hashCode() == Concert2.hashCode() && Concert1.hashCode() != Concert3.hashCode()) {
            System.out.println("Hashcode test for concerts passed" + "\n");
        }
        System.out.printf("%s%n", Concert1);
    }

}
