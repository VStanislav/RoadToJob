package lesson3;

import static java.lang.Thread.sleep;

public class PingPong {

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        pingPong.start();
    }

    private void start() {
        Thread ping = new Thread(new Print(), "ping");
        ping.start();
        Thread pong = new Thread(new Print(), "pong");
        pong.start();
    }

    private class Print implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    printWord();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private synchronized void printWord() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        sleep(300);
        notify();
        wait();
    }
}
