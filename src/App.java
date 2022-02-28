import regra.Agora;
import regra.Mensagem;
import regra.Saudacao;
import util.Tela;

public class App {
    public static void main(String[] args) throws Exception {

        Saudacao saudacao = new Saudacao(new Mensagem(new Agora()));

        String texto = saudacao.obterTexto();

        Tela.imprimir(texto);
    }

}
