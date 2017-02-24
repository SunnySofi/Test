import java.util.Random;
import java.util.Scanner;

/**
 * Created by dwite_000 on 25-Feb-17.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(in.nextLine());
        System.out.println("Ваше число: " + number);
        for (int i = 0; i < number; i++) {
            Random rand = new Random();
            int n = rand.nextInt();
            System.out.println(n);
        }
    }
}
