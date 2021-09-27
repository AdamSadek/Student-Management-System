package Project_1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Fees {
    private static HashMap<String, Integer> fees = new HashMap<>();
    public static void paymentInternational(){
            Scanner input = new Scanner(System.in);

            System.out.println("Please select the course you are taking");
            System.out.println(" 1. English Literature \n 2. Mathematics\n 3. Bio Medicine\n 4. Computer Science \n " +
                    "5. Software Engineering \n 6. Economics \n 7. Business \n -----------------------------");
            System.out.print("Course: ");
            while(!(input.hasNextInt())){
                System.out.print("Please enter an Integer: ");
                input.next();
            }
            int userCourse = input.nextInt();
            while(userCourse < 1 || userCourse > 7){
                System.out.print("Please enter a valid integer(1-7): ");
                userCourse = input.nextInt();
            }
            switch (userCourse){
                case 1:
                     int fee = 13400;
                     if(isInternational()){
                         System.out.println("Enter name: ");
                         while(!input.hasNext("[A-Za-z]*")) {
                             System.out.print("Please enter a valid full name: ");
                             input.next();
                         }
                         String studentName = input.next();
                         studentName = studentName.toLowerCase();

                         System.out.println("Enter ID:");
                         while(!(input.hasNextInt())){
                             System.out.print("Please enter an Integer: ");
                             input.next();
                         }
                         int studentID = input.nextInt();
                         while(studentID < 0 ){
                             System.out.print("Please enter a valid ID: ");
                             studentID = input.nextInt();
                         }


                         if((Enroll.names.containsValue(studentName))){
                             System.out.println("Amount due " + "$" + fee);
                             System.out.print("How much would you like to pay?: ");

                             while(input.nextInt() < 0 || input.nextInt() > fee){
                                 System.out.print("Please enter valid amount: ");
                                 input.nextInt();
                             }
                             int amountPaid = input.nextInt();
                             fee -= amountPaid;
                             System.out.println("Amount due now is: " + "$" + fee);
                             fees.put(studentName, fee);
                             fees.get(fee);
                         }
                     }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
            }

        }

    public static boolean isInternational(){
        Scanner input = new Scanner(System.in);
        System.out.print("Are you an international student?(y/n): ");
        while(!(input.nextLine().equals("y") || input.nextLine().equals("n"))){
            System.out.print("Please enter y or n: ");
            input.nextLine();
        }
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        if(userInput.equals("y")) return true;
        return false;
    }
}
