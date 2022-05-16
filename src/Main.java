import  java.util.Scanner;

public class Main {


    public static void main(String[] args)  {

        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("input digit:  ");
            int digit = scan.nextInt();
            array [i] = digit;
        }
        int test = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > test) System.out.println("Ok");
            else   System.out.println("Error");
        }
    }
}
