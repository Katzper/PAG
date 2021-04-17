import java.util.*;

public class Main {
    public static void main(String[] args) {
        Event EkipaFest = new Event();
        Scanner sc= new Scanner(System.in);

        System.out.print("Podaj nazwę wydarzenia:");
        String nazwa = sc.nextLine();
        EkipaFest.setName(nazwa);

        System.out.print("Podaj nazwę organizatora:");
        String organizator = sc.nextLine();
        EkipaFest.setOrganizer(organizator);

        System.out.print("Podaj liczbę uczestników:");
        int uczestnicy = sc.nextInt();
        EkipaFest.setParticipants(uczestnicy);

        System.out.print("Podaj budżet:");
        double budzet = sc.nextDouble();
        EkipaFest.setBudget(budzet);

        System.out.print("Czy bilety są dostępne? (true/false)");
        boolean bilety = sc.nextBoolean();
        EkipaFest.setTickets(bilety);

        System.out.print("Czy wydarzenie jest cykliczne? (true/false):");
        boolean cykliczne = sc.nextBoolean();
        EkipaFest.setRepetitive(cykliczne);


        System.out.println(EkipaFest.toString());

    }
}
