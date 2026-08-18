package Day_5_Assignment;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SecurePasswordStorage {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password ;
        Scanner sc = new Scanner(System.in);

        password = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        System.out.println("Original Password: " + password);
        System.out.println(sb.toString());

    }
}
