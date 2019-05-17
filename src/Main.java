import Actions.HeatingUp;
import Actions.Transfer;
import Users.Costumer;
import Users.Employer;
import Users.Manager;
import Users.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        Scanner scan = new Scanner(System.in);
        int n = 7; //length of user id
        String answer;

        HashSet<User> info = new HashSet<>();
//        info.add(new Costumer("cos"));
//        info.add(new Employer("emp"));            ////hardcoded users
//        info.add(new Manager("man"));

        HeatingUp toHeat = new HeatingUp(info);
        toHeat.action(n);

        do {
            System.out.println("Write down action: \n1.Add \n2.Delete \n3.Transfer \n4.List");

            int action = scan.nextInt();
            User user1 = null;
            User user2 = null;


            switch (action) {
//ADD
                case 1:
                    System.out.println("Type id");
//                    Scanner scanID = new Scanner(System.in);
                    String addId = scan.next();
                    System.out.println("Type job: \n1.Manager\n2.Employer\n3.Costumer");
//                    Scanner scanJob = new Scanner(System.in);
                    int job = scan.nextInt();

                    if (job == 1) {
                        info.add(new Manager(addId));
                    } else
                        if (job == 2) {
                        info.add(new Employer(addId));
                    } else
                        if (job == 3) {
                        info.add(new Costumer(addId));
                    }
                    break;

//DELETE

                case 2:

                    System.out.println("Type name");
//                    Scanner scanDelete = new Scanner(System.in);
                    String delId = scan.next();

                    for ( User user : info ) {
                        if (user.getId().equals(delId)) {
                            User tmpUser = user;
                            System.out.println(user.getId() + " deleted");
                            info.remove(tmpUser);
                        }
                    }

                    break;
//TRANSFER

                case 3:
                    System.out.println("Acceptable users to transfer:");
                    for ( User user : info ) System.out.println(user.getId());

                    System.out.println("\n" + "Enter ID of a sender");
                    Scanner scanS = new Scanner(System.in);
                    String iDS = scanS.next();

                    System.out.println("Enter ID of a gainer");
                    Scanner scanG = new Scanner(System.in);
                    String iDG = scanG.next();

                    for ( User user : info ) {

                        if (user.getId().equals(iDS)) {
                            user1 = user;
                        } else if (user.getId().equals(iDG)) {
                            user2 = user;
                        }
                    }

                    if (user1 == null || user2 == null) {
                        System.out.println("Wrong credentials");
                        System.exit(0);
                    }

                    System.out.println("Amount to transfer: ");
                    Scanner scanAmount = new Scanner(System.in);
                    int amount = scanAmount.nextInt();
                    Transfer.action(user1, user2, amount);
                    break;

//LIST

                case 4:
                    for ( User user : info ) {
                        user.iD();
                        user.balance();
                    }
                    break;
            }

            System.out.println("Continue? Y/N");
            answer = scan.next();

        } while (answer.toLowerCase().contains("y"));

    }
}
