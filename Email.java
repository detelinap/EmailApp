import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity = 500;
   private String alternateEmail;
   private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        do {
            this.department = setDepartment();
        }while (this.department.equals(null));
        this.password = randomPassword(8);
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;

    }

    private String setDepartment (){
        System.out.println("Enter Department\n 1 for sales \n 2 for development \n 3 for accounting \n 4 for management");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        switch (departmentChoice){
            case 1 :
                return "sales";

            case 2:
                return "development";

            case 3:
                return "accounting";
            case 4:
                return "management";

            default:
                return null;
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMOPQRSTUVWXYZ1234567890!@$#%^&*()";
        char[] password = new char[length];
        for(int i = 0; i<length; i++){
           int randomNumber = (int)(Math.random()*passwordSet.length());
           password[i] = passwordSet.charAt(randomNumber);
        }
        return new String(password);
    }

    public void printInformation(){
        System.out.println("Information about :"+firstName+" "+lastName);
        System.out.println(email);
        System.out.println("Mailbox capacity is "+mailboxCapacity+"MB .");
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getDepartment() {
        return department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }
}
