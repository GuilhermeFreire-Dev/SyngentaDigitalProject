import Format.Format;
import Reserva.Reserva;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        List<String> entradas = Arrays.asList(  "Regular:16Mar2009,17Mar2009,18Mar2009",
                                                "Regular:20Mar2009,21Mar2009,22Mar2009",
                                                "Rewards:26Mar2009,27Mar2009,08Mar2009");
        String client;
        String text;

        for (String ent : entradas) {

            text = ent;

            client = Format.getClient(text);

            List<Integer> date1 = Format.getDate(text.substring(8,17));
            List<Integer> date2 = Format.getDate(text.substring(18,27));
            List<Integer> date3 = Format.getDate(text.substring(28,37));

            System.out.println(reserva.orderReserva(date1, date2, date3, client));
        }
    }
}