public class WhileClass {

    public static void main(String[] args) {
        int numInscrito = 100;
        int numCupons = 50;
        int primeirosInscritos = 1;

        while (primeirosInscritos <= numCupons) {
            imprimeMessagem("Inscrito de número " + primeirosInscritos + " ganhou um cupom!");
            primeirosInscritos++;
        }
    }

    static void imprimeMessagem(String messagem) {
        System.out.println(messagem);
    }
}
