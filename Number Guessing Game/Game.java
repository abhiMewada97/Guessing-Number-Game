
// package Number Guessing Game;
import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String []args)
    {
        
        char choice='y';
        do{
            int random_num,user_num;
            
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            random_num = random.nextInt(100);
            
            int count=0;

            while (true) {
            
            System.out.println("Guess the number ");
            user_num = sc.nextInt();
            
            if(user_num == random_num)
            {
                count++;
                System.out.println("\n*****************************\nYou Win ");
                System.out.println("You Guess " +random_num+ " number in " +count+ " guess ");
                System.out.println("Your score is "+(100-count*3));
                
                System.out.println("do You want to continuee..........press 'y' & cancel 'n' ");
                choice = sc.next().charAt(0);
                break;
            }
            
            else if(user_num > random_num)
            System.out.println("You Enter big number ");

            else if(user_num < random_num)
            System.out.println("You Enter smaller number ");

            count++;
            }

        }while(choice == 'Y' || choice == 'y');

    }
}
