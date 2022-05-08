package Model.Hotels;

import java.util.List;

public class Hotel {
    private final int classificacao;
    private final double txDiaSemanaRegular;
    private final double txDiaSemanaReward;
    private final double txFinalSemanaRegular;
    private final double txFinalSemanaReward;

    public Hotel(int classificacao, double txDiaSemanaRegular, double txDiaSemanaReward, double txFinalSemanaRegular, double txFinalSemanaReward) {
        this.classificacao = classificacao;
        this.txDiaSemanaRegular = txDiaSemanaRegular;
        this.txDiaSemanaReward = txDiaSemanaReward;
        this.txFinalSemanaRegular = txFinalSemanaRegular;
        this.txFinalSemanaReward = txFinalSemanaReward;
    }

    public double custoTotal(List<Integer> dias, String tipoCliente) {
        double custo = 0;

        for (int d : dias) {
            if (d > 2 && d <= 4) {
                //finais de semana
                if (tipoCliente.equals("Regular"))
                    custo += txFinalSemanaRegular;
                else
                    custo += txFinalSemanaReward;
            } else {
                //dias da semana exceto finais de semana
                if (tipoCliente.equals("Regular"))
                    custo += txDiaSemanaRegular;
                else
                    custo += txDiaSemanaReward;
            }
        }

        return custo;
    }

    public int getClassificacao() { return classificacao; }
}
