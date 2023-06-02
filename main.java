package Exceptions1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,3,5,4};
        int[] arr1 = {2,4,5,6,4,6};
        int[] result = arraysDifference(arr, arr1);
        System.out.println(Arrays.toString(result));
    }
    public static int devide(int a1, int a2) {
        if(a2 == 0) {
            throw new RuntimeException("Devide by a zero");
        }
        return a1/a2;
    }
    public static long readFile(String file) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String fileString = reader.readLine();
            System.out.println(fileString);
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
        return 0;
    }

    public static int findNum(int index) {
        int[] array = {1,2,3,4,7,1};
        if (index > array.length) {
            throw new RuntimeException("Index out of range");
        }
        int number = array[index];
        return number;
    }
    public static int[] arraysDifference(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new NullPointerException("Оба массива должны существовать.");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Кол-во элементов массива должно быть одинаково");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
