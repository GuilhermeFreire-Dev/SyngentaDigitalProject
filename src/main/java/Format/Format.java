package Format;

import java.util.Arrays;
import java.util.List;

public class Format {
    public static List<Integer> getDate(String date) {
        String d = date.substring(0,2);
        String m = date.substring(2,5);
        String a = date.substring(5,9);
        int mes;

        switch (m) {
            case "Jan" -> mes = 1;
            case "Fev" -> mes = 2;
            case "Mar" -> mes = 3;
            case "Apr" -> mes = 4;
            case "May" -> mes = 5;
            case "Jun" -> mes = 6;
            case "Jul" -> mes = 7;
            case "Aug" -> mes = 8;
            case "Sep" -> mes = 9;
            case "Oct" -> mes = 10;
            case "Nov" -> mes = 11;
            case "Dec" -> mes = 12;
            default -> mes = 1;
        }

        return Arrays.asList(Integer.parseInt(d), mes, Integer.parseInt(a));
    }

    public static String getClient(String client) {
        return client.substring(0,7);
    }
}
