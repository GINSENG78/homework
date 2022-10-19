package HomeworkBankOOP;

public class Accountant extends Bank {
    public Accountant(String name, int id, String title, String DOB, int salary, String address) {
        super(name, id, title, DOB, salary, address);
    }


    @Override
    public void printBankDetails() {
        super.printBankDetails();
        System.out.println("The Account can be opened by " + name);
        System.out.println("The Account can be closed by " + name);
        System.out.println("The Report can be created by  " + name);

    }


}
