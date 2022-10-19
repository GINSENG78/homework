public class SelfTraining {
    public static void main(String[] args) {

        SelfTraining exercise1 = new SelfTraining();
        //     boolean result = exercise1.nearHundred(89);
        //      System.out.println(result);
        //     boolean lastDigit = exercise1.lastDigit(17,2);
        //      System.out.println(lastDigit);
        //     SelfTraining max = new SelfTraining();
        //     max.maxInt(5,6,7);
             boolean loveSeven = exercise1.loveSeven(4,3);
            System.out.println(loveSeven);
  //   SelfTraining calls = new SelfTraining();
  //   calls.answerCell(false,false,false);
    }

    public boolean nearHundred(int i) {

        if (i >= 90 && i <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lastDigit(int a, int b) {

        if (a % 10 == b % 10) {
            return true;
        } else {
            return false;
        }
    }

    public void maxInt(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }
    }

    public boolean loveSeven(int a, int b) {
        int sum;
        sum = a + b;
        if (a == 7) {
            return true;
        }
        else if (b == 7) {
            return true;
        }
        else if (sum == 7) {
            return true;
        } else {
            return false;
        }
    }

    public void answerCell(boolean isMorning,boolean isMom, boolean aSleep) {


        if (aSleep){
            System.out.println("false");
        }if (isMom && isMorning ||!isMorning){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
