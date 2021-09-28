package Project;

import java.util.Scanner;

public class userID {
    static int studentID;
    public static void setUserID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String userInput = input.next();
        while(true){
            if((!("1234567890".contains(userInput)))){
                System.out.print("Please enter a valid ID: ");
                userInput = input.next();
            }
            else{
                studentID = Integer.parseInt(userInput);
                break;
            }
        }

    }
    public static int getUserID(){
        return studentID;
    }
    public static int askAmountToPay() {
        Scanner input = new Scanner(System.in);
        setUserID();
        if ((Enroll.names.containsKey(getUserID())) && Fees.fees.get(getUserID()) != 0) {
            int fee = Fees.fees.get(getUserID());
            System.out.println("Amount due " + "$" + fee);
            while (true) {
                System.out.print("How much would you like to pay?: ");
                if ((!(input.hasNextInt())) && (input.nextInt() > fee || input.nextInt() < 0)) {
                    System.out.print("Please enter a valid amount: ");
                    input.next();
                } else if (Fees.fees.get(getUserID()) == 0) {
                    System.out.println("You have already paid your fees");
                }
                int userAmount = input.nextInt();
                Fees.fees.replace(getUserID(), fee - userAmount);
                System.out.println("Amount due now is: " + "$" + (fee - userAmount));
                return fee - userAmount;
            }
        }
        else {
            System.out.println("This ID does not exist!");
            askAmountToPay();
        }return 0;
    }
}
