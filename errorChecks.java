package Project;

import java.util.Scanner;

public class errorChecks {
    public static int validIntegerCourses() {
        Scanner input = new Scanner(System.in);
        int user_choice;
        while (true) {
            if (!input.hasNextInt()) {
                System.out.print("Please enter an Integer: ");
                input.next();
            }else break;
        }
        return input.nextInt();
    }



    public static int validId(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        while(true){
            if(!input.hasNextInt()){
                System.out.print("Please enter a valid ID: ");
                input.next();
            }
            else{
                return input.nextInt();
            }
        }
    }
}
