package Customer;

import DataClass.CustomerDetails;
import RoomDetails.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {

    private static List<Room>room = new ArrayList<>();
    private static List<String>customerList=new ArrayList<>();





    public List<Room> CustomerDetails()
    {

        CustomerDetails customer = new CustomerDetails();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter you name");
        String name=scan.next();

        System.out.println("enter you phonenumber");
        String phoneNumber=scan.next();

       // customerList.add(CustomerDetails);
        customerList.add(customer.setGuestName(name));
        customerList.add(customer.setGuestPhoneno(phoneNumber));




        return null;
    }

    public void displayCustomerDetails()
    {

        for(String s:customerList)
        {

            System.out.println(s);
        }



    }

/*public List<String> customerDetails()

{

    CustomerDetails customer = new CustomerDetails();
    Scanner scan = new Scanner(System.in);

    System.out.println("enter you name");
    String name=scan.next();

  System.out.println("enter you phonenumber");
  String phoneNumber=scan.next();


    List<String> customerDetails= new ArrayList<>();

    customerDetails.add(customer.setGuestName(name));
    customerDetails.add(customer.setGuestPhoneno(phoneNumber));

    for(String a:customerDetails)
    {

    }




    return customerDetails;
}*/





}
