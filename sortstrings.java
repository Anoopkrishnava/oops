import java.util.*;
public class sortstrings {
    public static void main(String[] args) {
        System.out.println("Enter the number of strings:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] arr = new String[n]; 
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        // Sort the array of strings
        // 
        Arrays.sort(arr);
        System.out.println("Sorted strings:");
        for (String str : arr) {
            System.out.println(str);
        }
        sc.close();
    }
    
}
