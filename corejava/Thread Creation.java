class MyThread implements Runnable {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - Count: " + i);
            try {
                Thread.sleep(500); // Add a little delay so you can see the interleaving
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("Thread One"));
        Thread thread2 = new Thread(new MyThread("Thread Two"));

        thread1.start();
        thread2.start();
    }
}
