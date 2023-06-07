import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        getFloatFromUser();
        getLineFromUser();
    }
    public static float getFloatFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = in.nextLine();
        float result;
        try {
            result = Float.parseFloat(number);
        }catch (NumberFormatException e){
            System.out.println("Произошла ошибка при преобразовании введенного значения в число с плавающей точкой");
            return getFloatFromUser();
        } catch (Exception e){
            System.out.println("Произошла ошибка при получении числа");
            return getFloatFromUser();
        }
        return result;
    }

//    Задание 2
//    try {
//        int d = 0;
//        int[] intArray = new int[10];
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }  catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Catching exception: " + e);
//    }

//    Задание 3
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (ArithmeticException ex) {
//            System.out.println("Что-то пошло не так");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Exception ex) {
//            System.out.println("Что-то пошло не так");
//        }
//    }

    public static void getLineFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = in.nextLine();
        if (line.isEmpty()) {
            System.out.println("Введена пустая строка, попробуйте снова.");
            getLineFromUser();
        }
    }
}
