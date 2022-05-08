package Model.Calendario;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    private final List<Integer> mes30;

    private boolean checkDia() {
        if (dia > 0 && dia <= 31) {
            if (dia >= 28) {
                if (mes != 2) {
                    //meses do ano exceto fevereiro.
                    if (dia > 30) {
                        //dia 31.
                        for (int m : mes30) {
                            //verificando o mês.
                            if (mes == m) return false;//dia 31 em um mês com 30 dias.
                        }
                    }
                    return true;
                }
                //verificar fevereiro.
                if (dia >= 29 && !checkBisexto())
                    return false;//fevereiro com 29 dias em um ano não bisexto.
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean checkMes() { return mes > 0 && mes <= 12; }

    private boolean checkAno() { return ano > 0; }

    private boolean checkBisexto() { return (ano%400 == 0) || (ano % 4 == 0 && ano % 100 != 0); }

    public Calendario() {
        dia = mes = ano = 1;
        mes30 = Arrays.asList(4,6,9,11);
    }

    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!checkDia() || !checkMes() || !checkAno())
            throw new InvalidParameterException();
    }

    public int diaDaSemana() {
        Calendar calendar = Calendar.getInstance();

        calendar.getTime();
        calendar.set(Calendar.YEAR, ano);
        calendar.set(Calendar.MONTH, mes);
        calendar.set(Calendar.DAY_OF_MONTH, dia);

        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
