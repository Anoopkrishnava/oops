// Thread for Multiplication Table of 5
class TableThread extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500); // pause for visibility
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread for Prime Numbers
class PrimeThread extends Thread {
    int n;

    PrimeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("\nFirst " + n + " Prime Numbers:");
        int count = 0, num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Method to check prime
    boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

// Main Class
public class ThreadExample {
    public static void main(String[] args) {

        TableThread t1 = new TableThread();
        PrimeThread t2 = new PrimeThread(10); // first 10 primes

        t1.start(); // start thread 1
        t2.start(); // start thread 2
    }
}