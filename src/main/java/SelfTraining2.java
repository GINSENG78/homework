import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SelfTraining2 {
    public static void main(String[] args) {
        SelfTraining2 needsExercises = new SelfTraining2();
        //    System.out.println(addChars("dog"));
        //     System.out.println (needsExercises.maxStart("max snacks"));
        //     System.out.println(needsExercises.fizzString("fib"));
        System.out.println(needsExercises.bigThere("beub"));


//        System.out.println(needsExercises.stringTimes("ho",5));
//        System.out.println(needsExercises.isPlural("plums"));


    }

    //    public static String addChars(String str) {
    //    char g = str.charAt(str.length() - 1);
    //       {
    //           return g + str + g;
    //       }

    //   }

//    public boolean maxStart(String str){
//        System.out.println(String.valueOf(str.charAt(1)));
//        System.out.println(String.valueOf(str.charAt(2)));
//        if ((str.charAt(1)) =='a' && (str.charAt(2)) =='x')
//        {
//            return true;
//        }
//        else
//        {
//           return false;
//        }

//    public String fizzString(String str){
//    String result1 = ("Fizz") + ("Buzz");
//    String result2 = "Fizz";
//    String result3 = "Buzz";
//        if((str.charAt(0))=='f' && (str.length()-1)=='b')
//        {
//            return result1;
//        }
//        else if (str.charAt(0)=='f')
//        {
//            return  result2;
//        }
//        else if ((str.length()-1)=='b')
//        {
//            return result3;
//        }
//        else {
//            return str;
//        }
//    }

    public boolean bigThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && (str.charAt(i +2) == 'b'))
            {
                return true;
            }
        } return false;
    }




//    public String stringTimes (String str,int n){
//        String result  = str.repeat(n);
//        return result;
//        }

// public boolean isPlural(String str){
//        if (str.charAt(str.length()-1)=='s'){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
    }




