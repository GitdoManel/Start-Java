public class BreakContinue {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
        // ou ( continue ) se for usado continue ele vai somar ate o 10.
      }
      System.out.println(i);
    }
  }
}
