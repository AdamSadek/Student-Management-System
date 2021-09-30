package Project;

import java.util.HashMap;
import java.util.Scanner;

public class Fees {
    public static HashMap<Integer, Integer> fees = new HashMap<>();
    public static void payment() {
            Scanner input = new Scanner(System.in);
            userID.setUserID();
            if ((Enroll.names.containsKey(userID.getUserID()))) {
                int fee = Fees.fees.get(userID.getUserID());
                int attempts = 5;
                int amountToPay = 0;
                if(Fees.fees.get(userID.getUserID()) == 0) {
                    System.out.println("You have already paid your fees");
                    return;
                }
                System.out.println("Amount due " + "$" + fee);
                System.out.print("How much would you like to pay?: ");

                while(true){
                    try{
                        amountToPay = input.nextInt();
                        if ((amountToPay > fee || amountToPay < 0)) {
                            System.out.println("You have " + attempts + " attempts left");
                            if (attempts == 0){
                                System.out.println("Sorry! you've run out of attempts!");
                                break;
                            }
                            attempts--;
                            System.out.print("Please enter a valid amount: ");
                        }else break;
                    }catch (Exception e){
                        System.out.println("You have " + attempts + " attempts left");
                        if(attempts == 0) break;
                        attempts--;
                        System.out.print("Please enter an Integer: ");
                        input.next();
                    }
                }
                    Fees.fees.replace(userID.getUserID(), fee - amountToPay);
                    System.out.println("Amount due now is: " + "$" + (fee - amountToPay));
                } else {
                System.out.println("This ID does not exist!");
                payment();
            }
        }
    public static boolean isNull(){
        return Fees.fees.get(userID.getUserID()) == null;
    }
    public static void viewBalance() {
        while(true) {
            userID.setUserID();
            if (isNull()) {
                System.out.println("This ID does not exist!");
            } else {
                System.out.println("You total balance is: " + "$" + Fees.fees.get(userID.getUserID()));
                break;
            }
        }
        }
    }


