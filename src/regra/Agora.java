package regra;

import java.time.LocalDateTime;

public class Agora {

    private LocalDateTime localDateTime;

    public Agora(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Agora() {
        this.localDateTime = LocalDateTime.now();
    }

    public int obterHora() {
        return localDateTime.getHour();
    }

}
