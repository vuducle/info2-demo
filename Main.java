import java.util.concurrent.TimeUnit;
class Main {
  public static void main(String[] args) {

    System.out.println("Hello World Info-2");

    try {
      while (true) {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Jede Sekunde wird was geprintet:");
        meow();
      }
    } catch (Exception e) {
      System.out.print(e.toString());
    }

  }
  private static void meow() {

    System.out.println("Git beste! Lab02, \uD83D\uDDFF");
  }
}
