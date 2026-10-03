package day_7;

public class UsingRunnable implements Runnable {

    private int h;
    private int l;
    private String msg;

    public UsingRunnable(int h, int l, String msg) {
        this.h = h;
        this.l = l;
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = h; i >= l; i--) {
            try {
                System.out.println(msg + " " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Task interrupted: " + e.getMessage());
            }
        }
    }
}