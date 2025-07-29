import java.util.*;

public class Numbergame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int user_input;
        int comp_input;
        int count = 0;
        int comp_wins = 0;
        int user_wins = 0;
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Welcome " + name);

        System.out.println("Game rules");
        System.out.println("---------------------------------");
        System.out.println("Rule No 1 : " + "Guess number under 10");
        System.out.println("Rule No 2 : " + "There is 5 match series between you and computer");
        System.out.println("Rule No 3 : " + "If you wins 3 games you will win the series");
        System.out.println("Rule No 4 : " + "If computer wins 3 games out of 5 then computer will win series");
        System.out.println("Rule No 5 : " + "Number must be equals to 10 either below to 10");
        System.out.println("---------------------------------");

        for (int i = 0; i < 5; i++) {
            
        System.out.println("Enter number please");
        user_input = sc.nextInt();

        comp_input = rand.nextInt(10) + 1;

        if (user_input < 1 || user_input > 10) {
        System.out.println("Invalid input! Please enter a number between 1 and 10.");
        continue; // skip this iteration and ask again
        }

        else if (user_input<comp_input) {
            System.out.println("____________________________________");
            System.out.println("Computer wins ... !!! ");
            System.out.println("Your number is less than computer input");
            System.out.println("____________________________________");
            System.out.println("Computer choice is : " + comp_input);
            count++;
            comp_wins++;
        }
        else if (user_input==comp_input) {
            System.out.println("____________________________________");
            System.out.println("Congratulatuions you win the match");
            System.out.println("____________________________________");
            count++;
            user_wins++;
        }
        else if (comp_input<user_input) {
            System.out.println("____________________________________");
            System.out.println("Computer wins ... !!! ");
            System.out.println("Your number is greater than computer input");
            System.out.println("____________________________________");
            System.out.println("Computer choice is : " + comp_input);
            
            count++;
            comp_wins++;
        }
        else {
            System.out.println("Invalid choice");
            break;

        
        }
        System.out.println("____________________________________");
        System.out.println("TOTAL MATCH PLAYED : " + count);
        System.out.println("COMPUTER WINS : " + comp_wins);
        System.out.println("USER WINS : " + user_wins);
        System.out.println("____________________________________");
    }
    if (user_wins<comp_wins) {
        System.out.println("____________________________________");
        System.out.println("Computer win the series");
        System.out.println("____________________________________");
    }
    else if (comp_wins<user_wins) {
        System.out.println("____________________________________");
        System.out.println( name + " win the series");
        System.out.println("____________________________________");
    }
    else {
        System.out.println("____________________________________");
        System.out.println("Series got tied");
        System.out.println("____________________________________");
    }
}
}