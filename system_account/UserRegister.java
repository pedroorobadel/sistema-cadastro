package system_account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    Scanner sc = new Scanner(System.in);

    String[] email;
    String[] user;
    String[] password;

    public UserRegister(String[] email, String[] user, String[] password) {

        this.email = email;
        this.user = user;
        this.password = password;
    }

    public static boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void listEmail() {

        while (true) {

            System.out.print("Enter your email: ");
            String userEmail = sc.nextLine().toUpperCase().trim().replaceAll("\s+", "");

            boolean emailVerify = false;
            if (isValidEmail(userEmail)) {
                for (int i = 0; i < email.length; i++) {
                    if (userEmail.contains(email[i])) {
                        emailVerify = true;
                        System.out.println("This email address already exists. Enter another email.");
                        break;
                    }
                }

                if (!emailVerify) {
                    System.out.println("Registered email address");
                    break;
                }

            } else {
                System.out.println("This email format is not valid. Enter another email.");
            }
        }
    }

    public void listUser() {

        while (true) {

            System.out.print("Enter your username: ");
            String userName = sc.nextLine().toUpperCase().trim().replaceAll("\s+", "");

            boolean usuarioVerify = false;
            for (int i = 0; i < user.length; i++) {
                if (userName.equals(user[i])) {
                    usuarioVerify = true;
                    System.out.println("This username already exists. Enter another username.");
                    break;
                }
            }

            if (!usuarioVerify) {
                System.out.println("Registered username");
                break;
            }
        }
    }

    public void listPassword() {

        while (true) {

            System.out.print("Enter your password: ");
            String userPassword1 = sc.nextLine().trim().replaceAll("\s+", "");

            System.out.print("Confirm your password: ");
            String userPassword2 = sc.nextLine().trim().replaceAll("\s+", "");

            if (userPassword1.equals(userPassword2)) {
                System.out.println("Account created successfully");
                break;

            } else {
                System.out.println("The passwords are not the same. Try again");
            }
        }
    }
}