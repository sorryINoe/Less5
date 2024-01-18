import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива" + "\n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int [][] mass = new int [a][b];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0 ; j < mass[i].length; j++ ) {
                mass[i][j] = random.nextInt(10);
            }
        }
        int c=0;
        System.out.print("Введите число" + "\n");
        int n = scanner.nextInt();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0 ; j < mass[i].length; j++ ) {
                mass[i][j] += n;
                c+= mass[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива = " + c );
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0 ; j < mass[i].length; j++ ) {
                System.out.println(mass[i][j] + " ");
            }
        }
    }
}
