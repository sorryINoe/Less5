import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String [][] mass = new String [8][8];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0 ; j < mass[i].length; j++ ) {
                if ((i + j) % 2 == 0) {
                    mass[i][j] = "W";
                } else {
                    mass[i][j] = "B";
                }
            }
        }
        for (String[] row : mass) {
            System.out.println(Arrays.toString(row));
        }
    }
}
