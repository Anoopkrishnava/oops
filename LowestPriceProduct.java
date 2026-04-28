import java.util.Scanner;

class Product {
    int p_code;
    String p_name;
    double price;
}
public class LowestPriceProduct {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        System.out.println("Enter details of Product 1:");
        System.out.print("Product Code: ");
        p1.p_code = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        p1.p_name = sc.nextLine();
        System.out.print("Price: ");
        p1.price = sc.nextDouble();
        System.out.println("\nEnter details of Product 2:");
        System.out.print("Product Code: ");
        p2.p_code = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        p2.p_name = sc.nextLine();
        System.out.print("Price: ");
        p2.price = sc.nextDouble();
        System.out.println("\nEnter details of Product 3:");
        System.out.print("Product Code: ");
        p3.p_code = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        p3.p_name = sc.nextLine();
        System.out.print("Price: ");
        p3.price = sc.nextDouble();
        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("\nProduct with the lowest price:");
        System.out.println("Product Code: " + lowest.p_code);
        System.out.println("Product Name: " + lowest.p_name);
        System.out.println("Price: " + lowest.price);

        sc.close();
    }
}
