package Customer;

import DataClass.CustomerDetails;
import RoomDetails.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {

    private List<Room>room = new ArrayList<>();



public List<String> customerDetails()

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
        System.out.println(a);
    }




    return customerDetails;
}





}
