package regra;

public class Saudacao {

    private Mensagem mensagem;

    public Saudacao(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public Saudacao() {
        this.mensagem = new Mensagem(new Agora());
    }

    public String obterTexto() {
        return mensagem
                .definirPeriodo()
                .obterTexto();
    }

}
