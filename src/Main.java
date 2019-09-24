import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        for (double a = 10, b = 8; a > -10; a = a - 2, b = b - 2) {
            if (b == 0)
                System.out.println("Error 0");
            System.out.println(a / b);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату: ");
        int date = in.nextInt();
        if (date==1794) {
                System.out.println("Верно!");}
        else {
            System.out.println("Не верно!");
            }
        }

    }
}
