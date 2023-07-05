import java.util.concurrent.*;

class Counter {
    volatile int cnt;

    public synchronized void increment() {
        cnt++;
    }

    public int getCount() {
        return cnt;
    }
}

public class CJava8 {
    public static void main(String[] args) {
        // creating a thread pool executor
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Counter counter = new Counter();

        // execute multiple threads
        for (int i = 0; i < 5; i++) {
            executorService.execute(new CounterTask(counter));
        }
        // shutting down the executor
        executorService.shutdown();

        // wait till all tasks completed
        while (!executorService.isTerminated()) {
        }
        // final cnt
        System.out.println("Final Count: " + counter.getCount());
    }
}

class CounterTask implements Runnable {
    Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        // Incrementing the count
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}
