package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* Classe utilitaire pour formater les dates
*/
public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /*
    * Formatte la date à l'aide du pattern donné
    *
    * @param pattern
    * @param date
    * @return date formattée en string
    */
    public static String format(String pattern, Date date) {

        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /*
    * Formatte la date à l'aide du pattern par défaut
    *
    * @param date
    * @return date formattée en string
    */
    public static String formatDefaut(Date date) {
        return format(DEFAULT_PATTERN, date);
    }
}
