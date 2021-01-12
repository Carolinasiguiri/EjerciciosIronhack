import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = {2, 4, 5};

        int[] multiply = arraynumbers(arrayInt);
        for(int k = 0; k < multiply.length; k++) {
            System.out.println(multiply[k]);
        }

        int[] revertida = reversion(arrayInt);

        for(int k = 0; k < revertida.length; k++) {
            System.out.println(revertida[k]);
        }

    }

    // create a new project where you iterate over an array of integers and update each position of this
    // array by multiplying that value by the value of the next position.
    // The last positicion must be multiplied by the first position of the array.
    public static int[] arraynumbers(int[] arg1) {

        int[] result = new int[arg1.length];

        for (int i = 0; i < arg1.length; i++) {

            if(i == arg1.length-1) {
                result[i] = arg1[i]*arg1[0];
            } else {
                result[i] = arg1[i] * arg1[i + 1];
            }

        }

        return result;
    }

    // in the same project create a method to invert an array.
    public static int[] reversion(int[] arg2) {
        int[] arrayNew = new int[arg2.length];

        int j = 0;

        for (int i = arg2.length-1; i >= 0; i--) {
            arrayNew[j] = arg2[i];
            j++;
        }

        return arrayNew;

    }
}