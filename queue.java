import java.util.*;

public class queue {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        String el;  
        int ch;
        System.out.print("\n----------------\n");
        System.out.println("1: Add");
        System.out.println("2: Remove");
        System.out.println("3: Display");
        System.out.println("4: Head");
        System.out.println("0: Exit");
        do {
            System.out.print("----------------\nEnter your choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    el = sc.next();
                    q.add(el);
                    break;

                case 2:
                    if (!q.isEmpty()) {
                        System.out.println("Removed: " + q.poll());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 3:
                    System.out.println("Priority Queue: " + q);
                    break;

                case 4:
                    if (!q.isEmpty()) {
                        System.out.println("Head: " + q.peek());
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong choice!");
            }

        } while (ch != 0);

        sc.close();
    }
}