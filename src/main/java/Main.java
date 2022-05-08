import Format.Format;
import Model.Calendario.Calendario;
import Reserva.Reserva;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Reserva reserva = new Reserva();
//
//        String cliente = input.next();
//
//

        String text = input.next();

        String cl = Format.getClient(text);
      //  List<Integer> date1 = Format.getDate(text.substring());
        //Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
        //Regular:16Mar2009,17Mar2009,18Mar2009

        List<Integer> date1 = Format.getDate(text.substring(8,17));
        List<Integer> date2 = Format.getDate(text.substring(18,27));
        List<Integer> date3 = Format.getDate(text.substring(28,37));

        reserva.orderReserva(date1, date2, date3, cl);

        System.out.println(cl);
//        for (int i : date1) {
//            System.out.println(i + "/");
//        }

    }
}
