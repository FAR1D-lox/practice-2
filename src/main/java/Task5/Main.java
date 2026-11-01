package Task5;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Timer timer = new Timer(12);
        timer.start();
        Thread.sleep(7500);
        timer.stop();
    }
}
