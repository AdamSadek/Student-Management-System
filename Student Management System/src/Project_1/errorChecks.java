package Project_1;

import java.util.Scanner;



public class errorChecks {
    public static int validIntegerCourses() {
        Scanner input = new Scanner(System.in);
        int user_choice = 0;
        int attempts = 5;
        while(true){
            try{
                user_choice = input.nextInt();
                if (user_choice > 7 || user_choice < 1) {
                    System.out.println("You have " + attempts + " attempts left");
                    if (attempts == 0){
                        System.out.println("Sorry! you've run out of attempts!");
                        break;
                    }
                    attempts--;
                    System.out.print("Please enter a valid number from (1-7): ");
                }else break;
            }catch (Exception e){
                System.out.println("You have " + attempts + " attempts left");
                if(attempts == 0) break;
                attempts--;
                System.out.print("Please enter an Integer: ");
                input.next();
            }
        }
        return user_choice;
    }
    public static int validId(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int idInput = 0;
        while(true){
            try{
                idInput = input.nextInt();
                if(!Enroll.names.containsKey(idInput)){
                    System.out.print("Please enter a valid ID: ");
                }else break;
            }catch (Exception e){
                System.out.print("Please enter a valid ID: ");
                input.next();
            }
        }
        return idInput;
    }
}
