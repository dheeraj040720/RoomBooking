import Customer.Operations;
import DataClass.CustomerDetails;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


      int flag=0;
        Scanner scan = new Scanner(System.in);

        CustomerDetails customer = new CustomerDetails();
        Operations op = new Operations();



        System.out.println("*******Hotel Managment********");

        System.out.println("Welcome ");

        System.out.println("Book a room");
        System.out.println(" View Customer Details");
        System.out.println(" Check Rooms Allocated");
        System.out.println("Exit");
        System.out.println("Enter your choice");

        int choice =scan.nextInt();

  /*     main instance = new main();

       instance.mult();*/


        switch (choice) {


            case 1:  op.customerDetails();
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;





        }












    }



}

