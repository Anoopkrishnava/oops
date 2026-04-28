// Fibonacci Runnable Class
class FibonacciRunnable implements Runnable {
    int n;

    FibonacciRunnable(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // new line
    }
}

// Even Numbers Runnable Class
class EvenRunnable implements Runnable {
    int start, end;

    EvenRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("\nEven Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // new line
    }
}

// Main Class
public class RunnableThreadExample {
    public static void main(String[] args) {
        // Create Runnable objects
        FibonacciRunnable f = new FibonacciRunnable(10);
        EvenRunnable e = new EvenRunnable(1, 20);

        // Create Threads
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(e);

        try {
            t1.start();   // start Fibonacci
            t1.join();    // wait until Fibonacci finishes

            t2.start();   // then start Even numbers
            t2.join();    // wait until Even finishes
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}