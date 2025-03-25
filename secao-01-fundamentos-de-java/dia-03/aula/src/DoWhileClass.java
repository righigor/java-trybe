import java.util.Random;

public class DoWhileClass {
    public static void main(String[] args) {
        int tentativas =0;
        boolean encomendaRecebida = false;
        String log;
        do {
            tentativas += 1;
            log = "Tentando entregar a correspondência, tentativa " + tentativas;
            encomendaRecebida = tentaEntregar();
            imprimeMessagem(log);
        } while (!encomendaRecebida);
    }

    static boolean tentaEntregar() {
        return Math.random() < 0.5;
    }
    static void imprimeMessagem(String messagem) {
        System.out.println(messagem);
    }
}
