import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListClass {

  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(5);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros);
    Collections.sort(numeros);
    System.out.println(numeros);

    List<String> estudantes = Arrays.asList("Joao", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes);
    String estudante = estudantes.get(1);
    System.out.println(estudante);
  }

}
