package Project_1;

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
            System.out.print("How much would you like to pay?: ");
            String amountToPay = input.next();
            while (true) {
                if (amountToPay.matches("[a-zA-Z]+") || amountToPay.matches("\\p{Punct}")){
                    System.out.print("Please enter an integer: ");
                    amountToPay = input.next();
                }
                else if ((Integer.parseInt(amountToPay) > fee || Integer.parseInt(amountToPay) < 0)) {
                    System.out.print("Please enter a valid amount: ");
                    amountToPay = input.next();
                }
                else if (Fees.fees.get(getUserID()) == 0) {
                     System.out.println("You have already paid your fees");
                }else{
                    Fees.fees.replace(getUserID(), fee - Integer.parseInt(amountToPay));
                    System.out.println("Amount due now is: " + "$" + (fee - Integer.parseInt(amountToPay)));
                    return fee - Integer.parseInt(amountToPay);
                }

            }
        }
        else {
            System.out.println("This ID does not exist!");
            askAmountToPay();
        }return 0;
    }
}
