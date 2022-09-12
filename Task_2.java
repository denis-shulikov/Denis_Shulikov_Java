import java.io.IOException;
import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) throws IOException {

        String ans = "Вячеслав";

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");

        String name = sc.nextLine();


        if (name.equals(ans)){
            System.out.println("Привет Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

