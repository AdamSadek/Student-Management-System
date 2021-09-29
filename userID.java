package Project;

import java.util.Scanner;

public class userID {
    static int studentID;
    public static void setUserID() {
        studentID = errorChecks.validId();
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
            while (true) {
                if (!input.hasNextInt()) {
                    System.out.print("Please enter a valid integer: ");
                    input.next();
                } else {
                    break;
                }
            }
            // FIX THIS PART ASAP
            int amountToPay = input.nextInt();
            while (true) {
                if ((amountToPay > fee || amountToPay < 0)) {
                    if(!input.hasNextInt()){
                        System.out.print("Please enter a valid integer: ");
                        input.next();
                } else {
                        System.out.print("Please enter a valid amount: ");
                        amountToPay = input.nextInt();
                    }
                }else break;
            }
            //
            amountToPay = input.nextInt();

            if (Fees.fees.get(getUserID()) == 0) {
                System.out.println("You have already paid your fees");
            } else {
                Fees.fees.replace(getUserID(), fee - amountToPay);
                System.out.println("Amount due now is: " + "$" + (fee - amountToPay));
                return fee - amountToPay;
            }
        }else {
            System.out.println("This ID does not exist!");
            askAmountToPay();
        }
        return 0;
    }
}
