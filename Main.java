package assignment3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Project: Difference-Arrays-ArrayLists
 * Description: Demonstrating the functional differences between
 * static Arrays and dynamic ArrayLists.
 */
public class Main {
    public static void main(String[] args) {
        String[] hardwareArray = new String[3];
        hardwareArray[0] = "CPU";
        hardwareArray[1] = "GPU";
        hardwareArray[2] = "RAM";

        ArrayList<String> hardwareList = new ArrayList<String>();
        hardwareList.add("CPU");
        hardwareList.add("GPU");
        hardwareList.add("RAM");
        hardwareList.add("SSD");

        System.out.println("Array Contents: " + Arrays.toString(hardwareArray));
        System.out.println("ArrayList: " + hardwareList);

        int[] primitiveArray = {10, 20};
        ArrayList<Integer> objectList = new ArrayList<>();
        objectList.add(30);
    }
}
