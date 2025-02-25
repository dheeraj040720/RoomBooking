package ServiceImpl;

import Model.CustomerDetails;
import Service.Service;

import java.util.LinkedList;
import java.util.Scanner;

public class ServiceImplementation  implements Service {

    static LinkedList<CustomerDetails>customerList=new LinkedList<>();
    @Override
    public void addCustomerDetails(CustomerDetails customer) {

        Scanner scan = new Scanner(System.in);

       System.out.println("enter your name");

       String s=customer.setCustomerName(scan.next());
        System.out.println("enter your phone number");
        String p=customer.setPhoneNumber(scan.next());
   customerList.add(customer);


    }

    @Override
    public void deleteCustomerDetailsById(CustomerDetails customer) {

    }

    @Override
    public void displayAllCustomerDetails() {

    }

    @Override
    public void displayCustomerDetailsById(int cid) {

    }
}
