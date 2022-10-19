package HomeworkBankOOP;

public abstract class Bank {
    String name;
    int id;
    String title;
    String DOB;
    int salary;
    String address;

    public Bank(String name,int id,String title,String DOB, int salary,String address){
        this.name = name;
        this.id = id;
        this.title = title;
        this.DOB = DOB;
        this.salary = salary;
        this.address = address;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary(){
        System.out.println("The salary were sent to employee");
    }
    public void printBankDetails(){
        System.out.println("**************");
        System.out.println("name is  :" + name);
        System.out.println("Id is  :" +id);
        System.out.println("Birth date is   :" +DOB);
        System.out.println("Salary is:  " +salary);
        System.out.println("Address is : " +address);
    }

}
