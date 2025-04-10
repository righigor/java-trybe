import java.util.HashMap;

public class MapClass {

  public static void main(String[] args) {
    HashMap<String, String> estudantes = new HashMap<String, String>();
    estudantes.put("x038702", "Joao");
    estudantes.put("x784244", "Maria");
    estudantes.put("x105852", "Joana");

    String valor = estudantes.put("x038702", "Jose");
    System.out.println("Valor anterior de x038702: " + valor);
    System.out.println("Estudantes: " + estudantes);
    System.out.println(estudantes.get("x105852"));
    estudantes.remove("x105852");
    System.out.println(estudantes);
  }
}
