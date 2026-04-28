import java.io.*;
import java.util.Scanner;

class NumWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file path:");
        String srcpath = scanner.next();

        try (
            BufferedReader reader = new BufferedReader(new FileReader(srcpath));
            BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"));
            BufferedWriter oddWriter = new BufferedWriter(new FileWriter("odd.txt"))
        ) {
            String num;

            while ((num = reader.readLine()) != null) {
                try {
                    int n = Integer.parseInt(num);

                    if (n % 2 == 0) {
                        evenWriter.write(n + "\n");
                    } else {
                        oddWriter.write(n + "\n");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + num);
                }
            }

            System.out.println("Files written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}