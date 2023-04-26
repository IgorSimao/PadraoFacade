import java.util.ArrayList;

public class cliente {
    public static void main(String[] args) {
        PacoteViagem pacote = new PacoteViagem();

        ArrayList<String> hospedes = new ArrayList<String>();
        hospedes.add("Igor Simao");
        hospedes.add("Paula");
        pacote.comprarPacote(hospedes, "Igor Simão", 3);
    }
}
