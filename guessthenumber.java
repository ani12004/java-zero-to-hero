import java.util.Scanner;
import java.util.Random;

public class guessthenumber {
    public static void main(String[] args) {
        Scanner lena =  new Scanner(System.in);
        Random gen = new Random();
        int num = gen.nextInt(100)+1;
        System.out.println("Enter Your guess between 1 to 100 : ");
        int guess = 0;
        while(guess != num) {
            guess = lena.nextInt();
            if (guess > num) {
                System.out.println("your guess is greater than number ");
            } else if (guess < num) {
                System.out.println("your guess is lesser than the number");
            }else {
                System.out.println("You Nailed it broooooo !!!");
            }
        }
    }
}
