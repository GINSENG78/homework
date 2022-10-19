package SelfTraining3Arrays;


import java.util.ArrayList;

public class HomeArrays {

    public boolean ArrayInteger(Integer[] intArray) {

        for (int i = 0; i <= intArray.length-1; i++) {
            if ( intArray[i] == 2 && intArray[i+1] == 2) {
                return true;
            }

        }
                return false;
    }
}















