public class HomeworkStringAssignment {
    public static void main(String[] args) {
        HomeworkStringAssignment compareStrings = new HomeworkStringAssignment();
   //     boolean result = compareStrings.isPalindrome("carrace");
//        System.out.println(result);
        compareStrings.compareStrings("Category","Cat");
    }
   public void compareStrings(String a, String b) {

       if (a == null || a == null) {
           System.out.println("Cannot compare strings");
       }
       else if  (a.equals(b)) {
           System.out.println("The strings are the same");
       }
       else if (a.contains(b)) {
           System.out.println("Cat is part of Category");
       }
   }
  //      public boolean isPalindrome(String text1){
  //      String text2 = "";

  //          int lastLetter = text1.length()-1;
  //          for (int i= lastLetter; i >=0; i--){
  //              text2 = text2 + text1.charAt(i);}
  //          System.out.println(text2);
  //          if (text1.equals(text2)){
  //            return true;
  //        }
  //        else {
  //            return false;
  //        }
    //}
}


