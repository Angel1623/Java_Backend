package day_7;

public class RunnableDemo {

    public static void main(String[] args) {

        // 1. Using implementable class
        UsingRunnable obj = new UsingRunnable(10, 1, "Hello");
        Thread t1 = new Thread(obj);
        t1.start();

        // 2. Using Anonymous Class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with Anonymous Class");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        // 3. Using Lambda Expression
        runnable = () -> {
            System.out.println("Runnable with Lambda Expression");
        };
        new Thread(runnable).start();

        System.out.println("-------------------------------------------------------");

        // 4. Lambda Expression with Loop & Sleep
        int n = 5;
        runnable = () -> {
            try {
                for (int i = 1; i <= n; i++) {
                    System.out.println("Loop iteration: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.err.println("Task interrupted.");
            }
        };

        new Thread(runnable).start();
    }
}