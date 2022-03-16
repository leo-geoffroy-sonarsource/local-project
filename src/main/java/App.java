/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static class Process {
    private boolean finished = false;

    public boolean isFinished() {
      return finished;
    }

    public void setFinished(boolean finished) {
      this.finished = finished;
    }
  }

  public static void main(String[] args) {
    System.out.println("Starting App 22");

    Process process = new Process();
    while (!process.isFinished()) {
      System.out.println(new App().getGreeting());
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
        @Override
        public void run() {
          System.out.println("Cancelled");
          process.setFinished(true);
        }
      }));


    }
  }
}
