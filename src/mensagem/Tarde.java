package mensagem;

import contrato.Periodo;

public class Tarde implements Periodo {

    @Override
    public String obterTexto() {
        return "Ainda não anoiteceu: é tarde aqui em Natal/RN";
    }

}
