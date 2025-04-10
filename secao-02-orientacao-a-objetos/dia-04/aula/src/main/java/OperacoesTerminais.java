import java.util.Collection;
import java.util.List;

public class OperacoesTerminais {

  public static void main(String[] args) {
    Collection<String> nomes = List.of("Fulano", "Maria", "Fulano", "Jose", "Jose", "Joana");
    long pessoasDistintas = nomes.stream().distinct().count();
    System.out.println(pessoasDistintas);
  }
}
