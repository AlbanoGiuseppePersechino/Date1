import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateStringFull = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("dateStringFull: " + dateStringFull);

        String dateStringMedium = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("dateStringMedium: " + dateStringMedium);

        String dateStringShort = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("dateStringShort: " + dateStringShort);


    }
}
