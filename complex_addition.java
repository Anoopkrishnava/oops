import java.util.*;

public class complex_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter imaginary part of first complex number: ");
        int im1 = sc.nextInt();
        System.out.println("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary part of second complex number: ");
        int im2 = sc.nextInt();
        int r = r1+r2;
        int im = im1+im2;
        System.out.println("Sum of complex numbers: "+r+" + "+im+"i");
        sc.close();
    }
}
