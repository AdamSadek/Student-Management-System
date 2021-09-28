package Project_1;

import java.util.Scanner;



public class errorChecks {
    public static int validInteger(){
        Scanner input = new Scanner(System.in);
        String user_choice = input.next();
        while(true){
            if(user_choice.matches("[a-zA-Z]+") || user_choice.matches("\\p{Punct}")){
                System.out.print("Please enter an Integer: ");
                user_choice = input.next();
            }

            else if(Integer.parseInt(user_choice) < 1 || Integer.parseInt(user_choice)  > 7){
                System.out.print("Please enter a valid integer(1-7): ");
                user_choice = input.next();
            }
            else{
                return Integer.parseInt(user_choice);
            }
        }


    }
}
