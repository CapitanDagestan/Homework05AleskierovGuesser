import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess = random.nextInt(11);
        System.out.println("Вгадай число, яке я загадав! Діапазон 0-10");
        for (int i = 1; i < 4; i++){
            System.out.println("Спроба " + i);
            int player = scanner.nextInt();
            if (guess == player){
                System.out.println("Ти переміг!");
                break;
            }else if (i == 3){
                System.out.println("Ти програв. Число було " + guess);
                break;
            }else if (guess > player){
                System.out.println("Спробуй більше.");
            } else if (guess < player) {
                System.out.println("Спробуй меньше.");
            }
        }
    }
}