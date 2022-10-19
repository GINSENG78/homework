package HomeworkBankOOP;

public class Manager extends Bank{


    public Manager(String name, int id, String title, String DOB, int salary, String address) {
        super(name, id, title, DOB, salary, address);

        }

    @Override
    public void printBankDetails() {
        super.printBankDetails();
        System.out.println("The employer could be  hire by " + name);
        System.out.println("The employer could be  fire by  " + name);
    }


}



