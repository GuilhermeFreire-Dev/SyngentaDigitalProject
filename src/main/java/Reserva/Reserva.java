package Reserva;

import Model.Calendario.Calendario;
import Model.Hotels.Bridgewood;
import Model.Hotels.Hotel;
import Model.Hotels.Lakewood;
import Model.Hotels.Ridgewood;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private final Hotel lake;
    private final Hotel bride;
    private final Hotel ridge;

    public Reserva() {
        lake = new Lakewood();
        bride = new Bridgewood();
        ridge = new Ridgewood();
    }

    public String orderReserva(List<Integer> day1, List<Integer> day2, List<Integer> day3, String cliente) {

        List<Integer> diasDeReserva = new ArrayList<>();

        Calendario calendario = new Calendario();

        calendario.setData(day1.get(0), day1.get(1), day1.get(2));
        diasDeReserva.add(calendario.diaDaSemana());

        calendario.setData(day2.get(0), day2.get(1), day2.get(2));
        diasDeReserva.add(calendario.diaDaSemana());

        calendario.setData(day3.get(0), day3.get(1), day3.get(2));
        diasDeReserva.add(calendario.diaDaSemana());

        double custoLake = lake.custoTotal(diasDeReserva, cliente);
        double custoBridge = bride.custoTotal(diasDeReserva, cliente);
        double custoRidge = ridge.custoTotal(diasDeReserva, cliente);

        //Verificar hotel mais barato
        Double min = Double.min(custoLake, custoBridge);
        min = Double.min(min, custoRidge);

        if (min.equals(custoRidge))
            return "Ridgewood";
        if (min.equals(custoBridge))
            return "Bridgewood";
        return "Lakewood";
    }
}
