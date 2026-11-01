package Task5;

public class Timer implements Task {

    private int seconds;

    private Thread timerThread;

    private volatile boolean isRunning;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Timer has already started");
            return;
        }
        isRunning = true;
        timerThread = new Thread(() -> {
            while (seconds >= 0 && isRunning) {
                System.out.println("Time to end: " + seconds + " seconds");
                if (seconds == 0) {
                    System.out.println("Time is up");
                    isRunning = false;
                    break;
                }

                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                    break;
                }
                seconds--;
            }
        });

        timerThread.start();
    }

    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Timer hasn't been started or has already finished");
            return;
        }

        System.out.println("Timer has stopped");
        isRunning = false;

        if (timerThread != null) {
            timerThread.interrupt();
        }
    }
}
