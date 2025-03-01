package ServiceImpl;

import Model.CustomerDetails;
import Service.Service;

import java.util.LinkedList;
import java.util.Scanner;

public class ServiceImplementation  implements Service {

    static LinkedList<CustomerDetails>customerList=new LinkedList<>();
    static int count=0;

    static int price=60;
    @Override
    public void addCustomerDetails() {

        CustomerDetails customer = new CustomerDetails();
        Scanner scan = new Scanner(System.in);


       System.out.println("enter your name");


       String s=customer.setCustomerName(scan.next());
        System.out.println("enter your phone number");
        String p=customer.setPhoneNumber(scan.next());
   customerList.add(customer);
   while(customerList!=null)
   {
       count++;
       customer.setCustomerId(count);
       break;
   }




    }

    @Override
    public void deleteCustomerDetailsById(CustomerDetails customer) {

    }

    @Override
    public void displayAllCustomerDetails() {
        for(  CustomerDetails s :customerList )
        {

            System.out.println(s);
        }

    }

    @Override
    public void displayCustomerDetailsById(int cid) {

    }

    @Override
    public void RoomCalculation() {



    }


}
