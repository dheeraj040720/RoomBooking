import ServiceImpl.ServiceImplementation;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice=0;
        char input=' ';


        System.out.println("*************");
        System.out.println("Room Booking");

        System.out.println("*************");


       do {

           System.out.println(" 1. Book a Room \n  2. View Booking   \n  3. Remove Booking  \n  4. CheckOut");
           choice = scan.nextInt();

           ServiceImplementation serviceImp = new ServiceImplementation();


           switch (choice) {

               case 1:
                   serviceImp.addCustomerDetails();
                   break;
               case 2:
                   serviceImp.displayAllCustomerDetails();
                   break;


               case 3:
                   System.out.println("enter the id to be deleted");
                   int cid= scan.nextInt();
                   serviceImp.displayCustomerDetailsById(cid);

               case 4:
                   System.out.println("enter name");
                   String id= scan.next();

                   serviceImp.RoomCalculation(id);
           }

           System.out.println("do u wan to continue  y or n ");
           input=scan.next().charAt(0);
       } while (input=='Y' || input=='y');

    }
}















