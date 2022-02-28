package mensagem;

import contrato.Periodo;

public class Noite implements Periodo {

    @Override
    public String obterTexto() {
        return "Vixe! Tava tarde. Vamos ver agora: noite. Deu certo";
    }

}
