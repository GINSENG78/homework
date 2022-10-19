import java.sql.SQLOutput;
	public class Homework2Loops {
        public static void main(String[] args) {
            Homework2Loops loops = new Homework2Loops();
//loops.positiveIntegers(25);
            Homework2Loops loops2 = new Homework2Loops();
            //       loops2.positiveIntegers(15);
            //       Homework2Loops loops3 = new Homework2Loops();
            //       loops3.calculateSummary(3,7);
            Homework2Loops loops4 = new Homework2Loops();
            loops4.buildPyramid(6);
        }

        public void positiveIntegers(int n) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println("The numbers " + i + "is divisible by two and three");
                } else if (i % 2 == 0) {
                    System.out.println("The numbers " + i + "is odd");
                } else if (i % 3 == 0) {
                    System.out.println("The numbers " + i + "is divisible by three");
                } else {
                    System.out.println("The numbers " + i + "is not divisible");
                }
            }
        }

        public void calculateSummary(int a, int b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        public void buildPyramid(int rows){
            for (int i = rows;  i >=1; i--){
                for (int j=1; j<=i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

            }
    }