package Day_5_Assignment;
import javax.net.ssl.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class GetCertificateInfo {

    public static void main(String[] args) throws Exception {

        String host = "google.com";
        int port = 443;

        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        SSLSocket socket = (SSLSocket) factory.createSocket(host, port);

        socket.startHandshake();

        SSLSession session = socket.getSession();


        System.out.println("Protocol: " + session.getProtocol());

        System.out.println("Cipher Suite: " + session.getCipherSuite());

        Certificate[] certificates = session.getPeerCertificates();

        System.out.println("\nCertificate Chain:");

        for (int i = 0; i < certificates.length; i++) {

            X509Certificate cert = (X509Certificate) certificates[i];

            System.out.println("\nCertificate " + (i + 1));

            System.out.println("Subject: " + cert.getSubjectX500Principal());

            System.out.println("Issuer: " + cert.getIssuerX500Principal());

            System.out.println("Serial Number: " + cert.getSerialNumber());

            System.out.println("Valid From: " + cert.getNotBefore());

            System.out.println("Valid Until: " + cert.getNotAfter());

            System.out.println("Signature Algorithm: " + cert.getSigAlgName());

            System.out.println("Public Key Algorithm: " + cert.getPublicKey().getAlgorithm());
        }

        socket.close();
    }
}
