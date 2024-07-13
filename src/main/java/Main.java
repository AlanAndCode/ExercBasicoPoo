// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Lampada L = new Lampada(false);

    L.ligar();
    System.out.println(L.detalhes());
     L.desligar();
     System.out.println(L.detalhes());
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}