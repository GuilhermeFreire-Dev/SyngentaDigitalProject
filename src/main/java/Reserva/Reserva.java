package Reserva;

import Model.Calendario.Calendario;
import Model.Hotels.Bridgewood;
import Model.Hotels.Hotel;
import Model.Hotels.Lakewood;
import Model.Hotels.Ridgewood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reserva {
    private Hotel lake;
    private Hotel bride;
    private Hotel ridge;

    public Reserva() {
        lake = new Lakewood();
        bride = new Bridgewood();
        ridge = new Ridgewood();
    }

    public void orderReserva(List<Integer> day1, List<Integer> day2, List<Integer> day3, String cliente) {

        List<Integer> diasDeReserva = new ArrayList<>();

        Calendario calendario = new Calendario();

        calendario.setData(day1.get(0), day1.get(1), day1.get(2));
        diasDeReserva.add(calendario.diaDaSemana());

        calendario.setData(day2.get(0), day2.get(1), day2.get(2));
        diasDeReserva.add(calendario.diaDaSemana());

        calendario.setData(day3.get(0), day3.get(1), day3.get(2));
        diasDeReserva.add(calendario.diaDaSemana());

        Double custoLake = lake.custoTotal(diasDeReserva, cliente);
        Double custoBridge = bride.custoTotal(diasDeReserva, cliente);
        Double custoRidge = ridge.custoTotal(diasDeReserva, cliente);

        //Verificar hotel mais barato


    }

}
