package RandomPassword;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Define the character sets
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String speChar = "@#$&*_";
        String num = "0123456789";
        String password = "";
        String randomPass = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want numbers in your password? (yes/no)");
        String number = scan.nextLine();
        System.out.println("Do you want uppercase letters in your password? (yes/no)");
        String uppercase = scan.nextLine();
        System.out.println("Do you want lowercase letters in your password? (yes/no)");
        String lowercase = scan.nextLine();
        System.out.println("Do you want special characters in your password? (yes/no)");
        String character = scan.nextLine();
        System.out.println("What should be the length of your password?");
        int length = scan.nextInt();

        // Build the character set based on user input
        if(number.equalsIgnoreCase("yes")) {
            password += num;
        }
        if(uppercase.equalsIgnoreCase("yes")) {
            password += upperCase;
        }
        if(lowercase.equalsIgnoreCase("yes")) {
            password += lowerCase;
        }
        if(character.equalsIgnoreCase("yes")) {
            password += speChar;
        }

        // Generate the password
        for(int i = 0; i < length; i++) {
            int randomIndex = (int)(Math.random() * password.length());
            randomPass += password.charAt(randomIndex);
        }

        // Output the generated password
        System.out.println("Generated password: " + randomPass);
    }
}
