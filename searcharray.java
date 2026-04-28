import java.util.Scanner;
public class searcharray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the size of the array (up to 10): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is present in the array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
        sc.close();
    }

    
}
