import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {public static void print(int[] array) {
    // array.length  - operator get count of element
    //for (int index = array.length - 1; index >= 0; index--) {
    for (int index = 0; index < array.length; index++) {
        int element = array[index];
        System.out.print(element + " ");
    }
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = copy0f(array1);
        array1[0] = 1000;
        print(array2);
        System.out.println(Arrays.toString(array1));
        System.out.print(Arrays.toString(array2));
        int findindexofelement = ArrayUtil.findelement(array1, searchElement: 5);
    }

    public static int[] copy0f(int[] inputArray) {
        int lengtholdArray = inputArray.length;
        int[] newArray = new int[lengtholdArray];

        for (int index = 0; index < lengtholdArray; index++) {

            int value = inputArray[index];
            newArray[index] = value;

        }
        return newArray;

    }
}