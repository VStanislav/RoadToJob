package lesson3.lock;

import java.util.concurrent.locks.Lock;

public class Counter {
    private int value;
    private Lock lock;

    public Counter(Lock lock) {
        this.lock = lock;
    }

    public long getValue() {
        return value;
    }

    public void incrementAndGet() {
        incrementAndGet(1L);
    }

    public void incrementAndGet(long increment) {
        try {
            lock.lock();
            this.value += increment;
        } finally {
            lock.unlock();
        }
    }
}
