import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 300;
        int count = 40;
        int[] speed = new int[count];
        for (int i = 0; i < speed.length; i++) {
            speed[i] = random.nextInt(  300 - 190 + 1 ) + 190;
            System.out.print(String.format("Максимальная скорость %d автомобиля: ", i + 1, count));
            System.out.println(speed[i]);
        }
        for (int i = 0; i < speed.length; i++) {
            if(speed[i] > max){
                max = speed[i];
            }
        }
        System.out.println(" ");
        System.out.print("Максимальная скорость: ");
        System.out.println(max);
        for (int i = 0; i < speed.length; i++) {
            if(speed[i] < min){
                min = speed[i];
            }

        }
        System.out.println(" ");
        System.out.print("Минимальная скорость: ");
        System.out.println(min);

    }
}