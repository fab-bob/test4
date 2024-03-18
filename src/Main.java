import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio
*/
public class Main {
    public static void main (String[] args) {
        System.out.println(month("2023-03-01T13:00:00Z"));
        System.out.println(dayOfTheWeek("2023-03-01T13:00:00Z"));
    }
    public static int year (String text) {
        OffsetDateTime data = OffsetDateTime.parse(text);
        return (data.getYear());
    }
    public static Month month (String text) {
        OffsetDateTime data = OffsetDateTime.parse(text);
        return (data.getMonth());
    }
    public static int dayOfTheMonth (String text) {
        OffsetDateTime data = OffsetDateTime.parse(text);
        return (data.getDayOfMonth());
    }
    public static DayOfWeek dayOfTheWeek (String text) {
        OffsetDateTime data = OffsetDateTime.parse(text);
        return (data.getDayOfWeek());
    }
}
