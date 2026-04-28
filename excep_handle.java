import java.util.*;

class NameException extends RuntimeException {
    NameException(String s) {
        super(s);
    }
}

class PassException extends RuntimeException {
    PassException(String s) {
        super(s);
    }
}

class User {
    String name, password;

    User(String n, String p) {
        name = n;
        password = p;
    }

    void login(String n, String p) {
        if (name.equals(n) && password.equals(p)) {
            System.out.println("\t\tLogin successful");
        } else {
            throw new PassException("Invalid username or password!");
        }
    }
}

class excep_handle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Name input
        System.out.print("Enter name: ");
        String s = sc.next();

        try {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (!Character.isLetter(ch)) {
                    throw new NameException("Invalid Name! Only alphabets allowed.");
                }
            }
        } catch (NameException e) {
            System.out.println(e.getMessage());
            return;
        }

        // 🔹 Password input
        System.out.print("Enter password: ");
        String pass = sc.next();

        try {
            if (pass.length() < 8) {
                throw new PassException("Password must have at least 8 characters.");
            }

            boolean hasDigit = false;

            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) {
                    hasDigit = true;
                }
            }

            if (!hasDigit) {
                throw new PassException("Password must contain at least 1 number.");
            }

        } catch (PassException e) {
            System.out.println(e.getMessage());
            return;
        }

        // 🔹 Create user
        User u1 = new User(s, pass);

        // 🔹 Login
        System.out.println("\t\tLogin!!");
        System.out.print("Username: ");
        String n1 = sc.next();

        System.out.print("Password: ");
        String p1 = sc.next();

        try {
            u1.login(n1, p1);
        } catch (PassException e) {
            System.out.println(e.getMessage());
        }
    }
}