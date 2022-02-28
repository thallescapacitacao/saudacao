package mensagem;

import contrato.Periodo;

public class Manha implements Periodo {

    @Override
    public String obterTexto() {
        return "Já amanheceu e eu estou aqui testando";
    }

}
