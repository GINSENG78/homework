package HomeworkBankOOP;

public class Clerk extends Bank {


    public Clerk(String name, int id, String title, String DOB, int salary, String address) {
        super(name, id, title, DOB, salary, address);

    }



    @Override
    public void printBankDetails() {
        super.printBankDetails();
        System.out.println("Customers can get call from  " + name);
        System.out.println("Customers can get answer from " + name);
    }
}
