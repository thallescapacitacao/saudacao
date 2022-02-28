package regra;

import contrato.Periodo;
import mensagem.Manha;
import mensagem.Tarde;
import mensagem.Noite;

public class Mensagem {

    private Agora agora;

    public Mensagem(Agora agora) {
        this.agora = agora;
    }

    public Periodo definirPeriodo() {
        if (horaAgoraEhMenorDoQueHorarioDoMeioDia()) {
            return new Manha();
        }
        if (horaAgoraEhMenorDoQueHorarioDoFinalDaTarde()) {
            return new Tarde();
        }
        return new Noite();
    }

    private boolean horaAgoraEhMenorDoQueHorarioDoFinalDaTarde() {
        return agora.obterHora() < Horario.FINAL_DA_TARDE;
    }

    private boolean horaAgoraEhMenorDoQueHorarioDoMeioDia() {
        return agora.obterHora() < Horario.MEIO_DIA;
    }

}
