package HomeworkBankOOP;

public class BankMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Peter", 1, "Manager", "1970-12-12", 10000,"Toronto");
        Clerk clerk = new Clerk("Nik",2,"Clerk","1972-01-01",3000,"Hamilton");
        Accountant accountant = new Accountant("Mary",3,"Accountant","1978-05-05",5000,"Ottawa");
        manager.printBankDetails();
        clerk.printBankDetails();
        accountant.printBankDetails();

    }

}
