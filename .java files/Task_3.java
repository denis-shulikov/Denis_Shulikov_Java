import java.util.Scanner;

public class Task_3 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Задайте размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Задайте элемент массива массива: ");
            array[i] = input.nextInt();
        }
        for (int i=0; i<size; i++){
            if (array[i] %3 == 0){
            System.out.print("[" + array[i] +"]" );
            }
        }

    }

}
