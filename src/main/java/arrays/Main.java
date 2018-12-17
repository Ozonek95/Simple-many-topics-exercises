package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int a[] =new int[5];
        a[0]=1;
        a[1]=5;
        a[2]=19;
        a[3]=100;
        a[4]=999;

        int b[] = new int[2];
        b[0]=19;
        b[1]=100;

        int[] result = Main.removeValues(b,a);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static boolean equals(int[] ar1, int[] ar2){
        boolean equals = true;
        if(ar1.length!=ar2.length){
            return false;
        }
        for (int i = 0; i < ar1.length; i++) {
            if(ar1[i]!=ar2[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] copyArray(int[] arrayToCopy){
        int[] result = new int[arrayToCopy.length];
        for (int i = 0; i < arrayToCopy.length; i++) {
            result[i] = arrayToCopy[i];
        }
        return result;
    }

    public static int oddOrNotArraySum(int[] array){

        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if(i%2==0){
                sumOfOdd+=array[i];
            }
            else{
                sumOfEven+=array[i];
            }
        }

        if(sumOfEven>sumOfOdd){
            return sumOfEven;
        }
        else return sumOfOdd;
    }

    public static boolean checkArray(int[] array){
        if((array[0]-1==array[1]&&array[1]==array[2]+1)){
            return true;
        }
        return false;
    }

    public static int[] removeValues(int[] array1,int[] array2){
        int[] biggerArray = array1;
        int [] smallerArray = array2;
        int longerArrayLength = array1.length;

        if(array2.length>array1.length){
            longerArrayLength = array2.length;
            biggerArray=array2;
            smallerArray = array1;
        }
        int[] result = new int[longerArrayLength];
        int counterOfUniqueNumbers = 0;
        int counterOfDoubledNumbers = 0;
        for (int i = 0; i < biggerArray.length; i++) {
            boolean numberExistInSecondArray = false;
            for (int j = 0; j < smallerArray.length; j++) {
                if(smallerArray[j]==biggerArray[i]){
                    numberExistInSecondArray = true;
                }
            }
            if(!numberExistInSecondArray){
                result[counterOfUniqueNumbers] = biggerArray[i];
                counterOfUniqueNumbers++;
            }
            else {
                counterOfDoubledNumbers++;
            }
        }

        int[] resultAfterSizeCorrection = new int[biggerArray.length-counterOfDoubledNumbers];

        for (int i = 0; i < resultAfterSizeCorrection.length; i++) {
            resultAfterSizeCorrection[i]=result[i];
        }

        return resultAfterSizeCorrection;

    }
}
