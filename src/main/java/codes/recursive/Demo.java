package codes.recursive;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test sending mail...");
        System.setProperty("mail.debug", "true");
        new EmailSender().send();
        System.out.println("Email sent!");
    }
}
