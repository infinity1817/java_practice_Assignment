package Day_5_Assignment;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class RSA_Encryption {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        String str = "Hii My password is $3frcfsdf";
        System.out.println("Original Message: " + str);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);

        byte[] encrypted = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));

        String encrytedStr = Base64.getEncoder().encodeToString(encrypted);
        System.out.println("Encrypted Message:" + encrytedStr);

        cipher.init(Cipher.DECRYPT_MODE,privateKey);

        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrytedStr));
        String decryptedStr = new String(decrypted , StandardCharsets.UTF_8);
        System.out.println( "Decrypted Message" + decryptedStr);

    }
}
