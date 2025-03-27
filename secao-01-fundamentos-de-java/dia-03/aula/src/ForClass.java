public class ForClass {
    public static void main(String[] args) {
        String[] nomes = new String[] {"MARCO", "FERNANDA", "FELIPE", "JULIA"};

        for (int i = 0; i < nomes.length; i++) {
            imprimeMessagem(nomes[i]);
        }

        for (String nome : nomes) {
            imprimeMessagem(nome);
        }
    }
    static void imprimeMessagem(String messagem) {
        System.out.println(messagem);
    }
}
