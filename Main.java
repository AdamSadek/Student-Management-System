package Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        userIntroduction.intro();

        while(true){
            while(!(input.hasNextInt())){
                System.out.print("Please enter an Integer: ");
                input.next();
            }
            int user_choice = input.nextInt();
            while(user_choice < 1 || user_choice > 6){
                System.out.print("Please enter a valid integer(1-6): ");
                user_choice = input.nextInt();
            }
            switch (user_choice){
                case 1:
                    Enroll.setName();
                    Enroll.setClasses();
                    break;
                case 2:
                    Fees.payment();
                    break;
                case 3:
                    Grades.currentGrades();
                    break;
                case 4:
                    Fees.viewBalance();
                    break;
                case 5:
                    Enroll.getDetails();
                    break;
                case 6:
                    break;
            }
            if(user_choice == 6) break;
            System.out.println();
            userIntroduction.choices();
        }

    }
}
