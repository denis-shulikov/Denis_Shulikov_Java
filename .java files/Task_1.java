import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args) throws IOException {

    int ans = 7;

    Scanner sc = new Scanner(System.in);
    System.out.print("Введите число: ");

    int number = sc.nextInt();


    if (number > ans) {
        System.out.println("Привет");
    } else {
        System.out.println("Попробуйте в другой раз");
    }
}
}


