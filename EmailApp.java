public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("John", "Smith");
        email.printInformation();
        Email newEmail = new Email("Jessie", "Janner");
        newEmail.printInformation();
    }
}
